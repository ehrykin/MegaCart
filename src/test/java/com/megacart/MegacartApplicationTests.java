package com.megacart;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.megacart.util.Localization;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MegacartApplicationTests {

	@Autowired
	Localization localization;

	@Test
	public void testResourceBundleValuesReading() {
		Assert.assertTrue(localization.getResources("user.user").size() > 0);
	}
}
