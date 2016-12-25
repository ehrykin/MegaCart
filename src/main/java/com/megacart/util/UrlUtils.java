package com.megacart.util;

import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

@Component
public class UrlUtils {
		
	public String createUrl(String urlPath, String[] urlArrayParams,  String... urlParams){
		if(urlParams.length % 2 != 0)
			throw new IllegalArgumentException("Url params number must be even number.");
		
		UriComponentsBuilder builder = UriComponentsBuilder.fromPath(urlPath);		
		for(int i = 0; urlArrayParams != null && i < urlArrayParams.length; i+=2) 
			builder.queryParam(urlArrayParams[i], urlArrayParams[i + 1]);		
		for(int i = 0; urlParams != null && i < urlParams.length; i+=2)
			builder = builder.queryParam(urlParams[i], urlParams[i + 1]);
		return builder.build().toUriString();
	}

	public Map<String, String> createBreadCrumb(String fullMessageKey, String urlPath, String[] urlArrayParams, String... urlParams){
		Map<String, String> result = new HashMap<>(2);
		result.put("text", ResourceBundle.getBundle("messages").getString(fullMessageKey));
		result.put("href", createUrl(urlPath, urlArrayParams, urlParams));
		return result; 
	}
	
	public <T> String[] arrayAsUrlParam(String paramName, T... values){
		String[] result = new String[values.length * 2];
		for(int i = 0; values != null && i < values.length; i++){
			result[i] = paramName;
			result[i + 1] = String.valueOf(values[i]);
		}
		return result;
	}
}
