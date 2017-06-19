package com.test;

import java.util.HashMap;

public class HashMapTest 
{
	public static void main(String[] args) 
	{
		HashMap<car, String> carHashMap = new HashMap<car, String>();
		car car1 = new car("320D", "bmw");
		car car2 = new car("320D", "bmw");
		
		
		System.out.println(car1.hashCode());
		System.out.println(car2.hashCode());
		
		
		carHashMap.put(car1, "myCar");
		carHashMap.put(car2, "myCar");
		
		System.out.println(carHashMap.size());
		System.out.println(carHashMap);
		
		HashMap<String, String> tempHashMap =  new HashMap<>();
		tempHashMap.put("1", "kumar");
		tempHashMap.put("1", "kumar");
		
		System.out.println(tempHashMap);
	}
}

class car
{
	public car(String name, String company) {
		super();
		this.name = name;
		this.company = company;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	private String name;
	private String company;
	
	
	public boolean equals(car obj) {
		System.out.println("At equals");
		String company = obj.getCompany();
		String name = obj.getName();
		if(company.equals(this.getCompany())
			&& name.equals(this.getName()))
		{
			return true;
		}
		return false;
	}
	
	public int hashCode() {
		return (this.name + this.company).hashCode();
	}
}