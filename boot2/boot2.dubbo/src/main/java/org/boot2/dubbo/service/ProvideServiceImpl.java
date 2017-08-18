package org.boot2.dubbo.service;


import com.alibaba.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class ProvideServiceImpl implements IProvideService{

	@Override
	public String sayHello() {
		return "================= hello andy! ===============";
	}

}
