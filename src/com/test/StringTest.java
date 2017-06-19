package com.test;

public class StringTest {

	public static void main(String[] args) {
		String str = "sunil";
		stringMethod(str);
		System.out.println(str);
	}
	
	public static void stringMethod(String str)
	{
		str = str + "kumar";
	}	
}
