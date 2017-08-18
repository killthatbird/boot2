package org.modules.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix="test")
public class ConfigurationProperties_Config {

	private String test1;
	private Integer testInt;
	
	public String getTest1() {
		return test1;
	}
	public void setTest1(String test1) {
		this.test1 = test1;
	}
	public Integer getTestInt() {
		return testInt;
	}
	public void setTestInt(Integer testInt) {
		this.testInt = testInt;
	}
	
	
}
