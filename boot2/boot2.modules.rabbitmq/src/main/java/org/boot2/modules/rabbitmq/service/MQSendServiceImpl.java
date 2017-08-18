package org.boot2.modules.rabbitmq.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class MQSendServiceImpl {

	public void sendMsgByQueue(String exchange, String routingKey, Object message){
		rabbitTemplate.convertAndSend(exchange, routingKey, message);
	}
	
	@Autowired
    private AmqpTemplate rabbitTemplate;
}
