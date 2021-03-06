package org.boot2.modules.redis;

import static org.junit.Assert.assertEquals;

import org.boot2.modules.redis.service.RedisTemplateServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisAppTest {

	@Test
	public void testAddKey(){
		redisTemplateServiceImpl.addKey("testAddKey");
		assertEquals(true, redisTemplateServiceImpl.findKey("testAddKey"));
	}
	
	@Autowired
	private RedisTemplateServiceImpl redisTemplateServiceImpl;
	
}
