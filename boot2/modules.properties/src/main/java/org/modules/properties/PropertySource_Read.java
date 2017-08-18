package org.modules.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * 两种读取方式: 
 * 1 通过Value注解
 * 2 通过Environment，这是由于配置了@PropertySoruce注解，
 * Environment bean可以访问指定配置文件里定义的所有属性值。
 */
@Component
public class PropertySource_Read {

	@Value("${test.test1:defaultValue}")
    public String test1;
	@Value("${test.testInt:0}")
	public Integer testInt;
	
	public String getTest1() {
		return test1;
	}
	public Integer getTestInt() {
		return testInt;
	}
	
	
	public String readByEnvironment1(){
		return environment.getProperty("test.test1");
	}
	
	public Integer readByEnvironment(){
		return Integer.parseInt(environment.getProperty("test.testInt"));
	}
	
	@Autowired
    private Environment environment;
}
