package org.boot2.modules.rabbitmq.cfg;

import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

  
/** 
 * 创建消息生产者 
 */  
@Configuration
public class ProducerConfig{

   @Autowired
   private MQSetting mqSetting;
	/** 
     * 连接rabbitmq 
     */  
    @Bean  
    public ConnectionFactory connectionFactory(){  
        CachingConnectionFactory connectionFactory=new CachingConnectionFactory();  
        connectionFactory.setAddresses(mqSetting.getAddresses());  
        connectionFactory.setUsername(mqSetting.getUserName());  
        connectionFactory.setPassword(mqSetting.getPassword()); 
        connectionFactory.setVirtualHost(mqSetting.getVirtualHost());
        connectionFactory.setConnectionTimeout(
        		Integer.parseInt(mqSetting.getConnectionTimeout()));
        return connectionFactory;  
    }  
  
    /** 
     * rabbitAdmin代理类 
     * @return 
     */  
    @Bean  
    public RabbitAdmin rabbitAdmin(ConnectionFactory connectionFactory){  
        return new RabbitAdmin(connectionFactory);  
    }  
  
    /** 
     * 创建rabbitTemplate 消息模板类 
     * prototype原型模式:每次获取Bean的时候会有一个新的实例 
     *  因为要设置回调类，所以应是prototype类型，如果是singleton类型，则回调类为最后一次设置 
     * @return 
     */  
    @Bean  
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)  
    public RabbitTemplate rabbitTemplate(){  
       RabbitTemplate rabbitTemplate=new RabbitTemplate(connectionFactory());  
       rabbitTemplate.setMessageConverter(new Jackson2JsonMessageConverter());//数据转换为json存入消息队列  
        return rabbitTemplate;  
    }  
} 
