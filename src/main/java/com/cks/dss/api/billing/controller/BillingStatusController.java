package com.cks.dss.api.billing.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cks.dss.api.billing.config.DssApiBillingBaseConfig;

@RestController
public class BillingStatusController {
	@Autowired
	private DssApiBillingBaseConfig dssApiBillingBaseConfig;
	
	@GetMapping("/billingdetails")
	public List<String> getBillingDetails(){
		if(dssApiBillingBaseConfig.getBillingMaintenance().equalsIgnoreCase("true")) {
			return new ArrayList<>();
		} else {
			return new ArrayList<>(Arrays.asList("billing-data-1", "billing-data-2"));
		}
	}
}
