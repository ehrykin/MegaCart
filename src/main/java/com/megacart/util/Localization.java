package com.megacart.util;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import org.springframework.stereotype.Component;

@Component
public class Localization {
	
	private static final String DELIMITER = ".";
	
	public Map<String, String> getResources(String resourceGroupName){
		Map<String, String> result = new HashMap<>();
		
		ResourceBundle rb = ResourceBundle.getBundle("messages");
		Enumeration <String> keys = rb.getKeys();
		while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			if(key.startsWith(resourceGroupName + DELIMITER))
				result.put(removeResourceGroupName(key, resourceGroupName), rb.getString(key));
		}		
		return result;
	}
	
	private String removeResourceGroupName(String originalResourceName, String resourceGroupName){
		return originalResourceName.substring((resourceGroupName + DELIMITER).length());
	}
}
