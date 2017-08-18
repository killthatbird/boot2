package org.boot2.modules.rabbitmq.cfg;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="spring.rabbitmq")
public class MQSetting {

	private String exchange;
    private String queue;
    private String routingKey;
	private String addresses;
	private String userName;
	private String password;
	private String virtualHost;
	private String connectionTimeout;
	public String getExchange() {
		return exchange;
	}
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}
	public String getQueue() {
		return queue;
	}
	public void setQueue(String queue) {
		this.queue = queue;
	}
	public String getRoutingKey() {
		return routingKey;
	}
	public void setRoutingKey(String routingKey) {
		this.routingKey = routingKey;
	}
	public String getAddresses() {
		return addresses;
	}
	public void setAddresses(String addresses) {
		this.addresses = addresses;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getVirtualHost() {
		return virtualHost;
	}
	public void setVirtualHost(String virtualHost) {
		this.virtualHost = virtualHost;
	}
	public String getConnectionTimeout() {
		return connectionTimeout;
	}
	public void setConnectionTimeout(String connectionTimeout) {
		this.connectionTimeout = connectionTimeout;
	}
}
