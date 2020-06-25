package com.cks.dss.api.billing.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DssApiBillingBaseConfig {
	@Value("${billing.maintenance}")
	private String billingMaintenance;

	public String getBillingMaintenance() {
		return billingMaintenance;
	}

	public void setBillingMaintenance(String billingMaintenance) {
		this.billingMaintenance = billingMaintenance;
	}
}
