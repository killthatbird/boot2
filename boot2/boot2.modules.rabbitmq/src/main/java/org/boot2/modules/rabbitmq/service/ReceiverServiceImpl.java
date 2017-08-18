package org.boot2.modules.rabbitmq.service;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;  
  
  
@Service  
@PropertySource("classpath:application.properties")
public class ReceiverServiceImpl{  
	
    @RabbitListener(queues = "${spring.rabbitmq.queue}")  
    @RabbitHandler  
    public void receiveQueue(String msg) { 
        System.out.println("=========receive======="+msg);   
    }  
  
}
