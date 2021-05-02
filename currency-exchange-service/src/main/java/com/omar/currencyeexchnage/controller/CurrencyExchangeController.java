package com.omar.currencyeexchnage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.omar.currencyeexchnage.model.ExchangeValue;
import com.omar.currencyeexchnage.repository.ExchangeValueRepository;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	private ExchangeValueRepository repo;
	
	@Autowired
	private Environment env;

	@GetMapping("/currency-exchange/form/{from}/to/{to}")
	public ExchangeValue retreiveExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to) {
		ExchangeValue value = repo.findByFromAndTo(from, to);
		value.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		return value;
	}

}
