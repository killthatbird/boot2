package org.boot2.modules.rabbitmq;

import java.util.Date;

import org.boot2.modules.rabbitmq.service.MQSendServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitMQAppTest {

	@Test
	public void testAddKey(){
		int sendMsg = new Date().hashCode();
		System.out.println("==========sendMsg=========="+sendMsg);
		mqSendServiceImpl.sendMsgByQueue("exchange_1", "routingKey_1", sendMsg);
	}
	
	@Autowired
	private MQSendServiceImpl mqSendServiceImpl;
}
