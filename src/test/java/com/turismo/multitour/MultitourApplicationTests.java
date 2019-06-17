package com.turismo.multitour;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.turismo.multitour.controller.ToursController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MultitourApplicationTests {

	@Test
	public void contextLoads() {
		
	}
	
	@Test
	void test() {
		ToursController toursController = new ToursController();
		
		
	}
}
