package com.practice.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.microservices.limitsservice.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationComponent {
	
	@Autowired
	public Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration retriewLimitsFromConfiguration() {
		
		return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
		
	}

}
