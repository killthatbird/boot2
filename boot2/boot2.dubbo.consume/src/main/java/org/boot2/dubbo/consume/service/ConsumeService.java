package org.boot2.dubbo.consume.service;

import org.boot2.dubbo.service.IProvideService;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;


@Service
public class ConsumeService {

	@Reference(version = "1.0.0")
	private IProvideService provideServiceImpl;
	
	public void consume(){
		System.out.println(provideServiceImpl.sayHello());
	}
	
}
