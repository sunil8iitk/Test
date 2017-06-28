package com.test;

import java.util.HashMap;
import java.util.Map;

public class MapTestSingleEntry 
{
	public static void main(String[] args) {
		Map<String, String> myMap = new HashMap<>();
		System.out.println((String) myMap.values().toArray()[0]);
		
		// Whenever a data Structure is initialised, it is empty.
		// In above when we convert the values of the Map into an Array, and access the first
		// element it gives us ArrayOutOfBoundsOfException.
		
	}
}
