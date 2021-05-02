package com.omar.currencycalculation.facade;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.omar.currencycalculation.model.ExchangeValue;

@FeignClient(name = "currency-exchange-service")
@LoadBalancerClient(name = "currency-exchange-service")
public interface CurrencyExchangeProxy {
	
	@GetMapping("/currency-exchange/form/{from}/to/{to}")
	public ExchangeValue retreiveExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to);
}
