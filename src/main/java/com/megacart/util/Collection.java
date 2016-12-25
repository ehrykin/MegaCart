package com.megacart.util;

import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class Collection {
	public <T> Map<T, T> fillMap(Map<T, T> map, T... values){
		if(values.length % 2 != 0)
			throw new IllegalArgumentException("Values count must be even number.");
		
		for(int i = 0; i < values.length; i+=2)
			map.put(values[i], values[i + 1]);
		
		return map;
	}
}
