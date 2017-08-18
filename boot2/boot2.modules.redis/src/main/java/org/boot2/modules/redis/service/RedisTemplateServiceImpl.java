package org.boot2.modules.redis.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisTemplateServiceImpl {
	
	public void addKey(String key){
		redisTemplate.opsForValue().setIfAbsent(key, "1");
	}
	
	public boolean findKey(String key){
		Object Object = redisTemplate.opsForValue().get(key);
		boolean result = false;
		if(Object!=null){
			result = true;
		}
		return result;
	}
	
	public void deleteKey(String keys){
		redisTemplate.delete(keys);
	}

	public Set<String> findKeys(String pattern){
		return redisTemplate.keys(pattern);
	}
	
	@Autowired
	private RedisTemplate<String, String> redisTemplate;
}
