package com.omar.limits.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.omar.limits.bean.LimitsConfiguration;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	private LimitsConfiguration limitsConfigurationController;

	@GetMapping("/limits")
	public LimitsConfiguration returnLimits() {
		return limitsConfigurationController;

	}
}
