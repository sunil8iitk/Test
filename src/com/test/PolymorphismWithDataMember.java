package com.test;

public class PolymorphismWithDataMember
{
	public static void main(String[] args) 
	{
		Bike b = new Splendor();
		b.testRide();
	}
}

class Bike
{
	public void testRide()
	{
		System.out.println("Test riding Bike");
	}
}

class Splendor extends Bike
{
	public void testRide()
	{
		System.out.println("Test riding Splendor");
	}
	
	public static void getPrice()
	{
		System.out.println("34k");
	}
}
