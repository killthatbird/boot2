package org.modules.properties;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest {

	@Test
	public void testRead(){
		System.out.println("==========testRead start==========");
		System.out.println(read.readByEnvironment());
		System.out.println(read.readByEnvironment1());
		System.out.println(read.getTest1());
		System.out.println(read.getTestInt());
		System.out.println("==========testRead end==========");
	}
	
	@Test
	public void testRead1(){
		System.out.println("==========testRead1 start==========");
		System.out.println(read1.getTest1());
		System.out.println(read1.getTestInt());
		System.out.println("==========testRead1 end==========");
	}
	
	@Autowired
	private PropertySource_Read read;
	@Autowired
	private ConfigurationProperties_Config read1;
}
