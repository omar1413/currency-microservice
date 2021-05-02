package com.omar.currencycalculation.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.omar.currencycalculation.facade.CurrencyExchangeProxy;
import com.omar.currencycalculation.model.CalculatedAmount;
import com.omar.currencycalculation.model.ExchangeValue;

@RestController
public class CurrenceyCalculationController {
	
	
	@Autowired
	private CurrencyExchangeProxy proxy;
	
	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CalculatedAmount calculateAmount(@PathVariable("from") String from, @PathVariable("to") String to, @PathVariable BigDecimal quantity) {
		
		Map<String,String> uriVariables = new HashMap<>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);
		
		ResponseEntity<ExchangeValue> res= new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/form/{from}/to/{to}", ExchangeValue.class,uriVariables);
		ExchangeValue val = res.getBody();
		CalculatedAmount calculatedAmount = new CalculatedAmount(val.getId(), from, to, val.getConvertioMultibel(), quantity, quantity.multiply(val.getConvertioMultibel()));
		calculatedAmount.setPort(val.getPort());
		
		return calculatedAmount;
	}
	
	
	
	@GetMapping("/currency-coverter-feign/from/{from}/to/{to}/quantity/{quantity}")
	public CalculatedAmount calculateAmountFeign(@PathVariable("from") String from, @PathVariable("to") String to, @PathVariable BigDecimal quantity) {
		
		
		ExchangeValue val = proxy.retreiveExchangeValue(from, to);
		CalculatedAmount calculatedAmount = new CalculatedAmount(val.getId(), from, to, val.getConvertioMultibel(), quantity, quantity.multiply(val.getConvertioMultibel()));
		calculatedAmount.setPort(val.getPort());
		
		return calculatedAmount;
	}

}
