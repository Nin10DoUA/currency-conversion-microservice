package ua.com.evgeniy.currencyconversionmicroservice.feignproxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ua.com.evgeniy.currencyconversionmicroservice.beans.CurrencyConversion;

@FeignClient(name = "currency-exchange", url = "localhost:8000")
public interface CurrencyConversionProxy {

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyConversion retrieveExchangeValue(@PathVariable String from, @PathVariable String to);

}
