package com.megacart.util;

import java.util.Map;

import org.junit.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LocalizationTest {

	@Autowired
	Localization localization;
	
	@Test
	public void testGetResources() {
		for(Map.Entry<String, String> resource : localization.getResources("user.user").entrySet())
			System.out.println(resource.getKey() + " -> " + resource.getValue());
		Assert.assertTrue(localization.getResources("user.user").size() > 0);
	}

}
