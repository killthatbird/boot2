package org.boot2.dubbo.consume;

import org.boot2.dubbo.consume.service.ConsumeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ConsumeTest {

	@Autowired
	private ConsumeService cs;
	
	@Test
	public void testC(){
		cs.consume();
	}

}
