package com.test;

import java.util.HashMap;
import java.util.Map.Entry;

public class EqualsAndHasCode 
{
	public static void main(String[] args) 
	{
		Bottle b1 = new Bottle(1, "red");
		Bottle b2 = new Bottle(2, "green");
	
		HashMap<Bottle, String> botHashMap = new HashMap<>();
		botHashMap.put(b1,"1");
		botHashMap.put(b2,"2");
		
		for(Entry<Bottle,  String> e : botHashMap.entrySet())
		{
			System.out.println(e.getValue().hashCode());
		}
		
		System.out.println(botHashMap.get(new Bottle(1, "red")));
	}
}

class Bottle
{
	@Override
	public String toString() {
		return "color is : " + this.getColor();
	}
	
	int size;
	public Bottle(int size, String color) {
		super();
		this.size = size;
		this.color = color;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	String color;
	

	@Override
	public boolean equals(Object obj) 
	{
		return this.getColor().equals(((Bottle) obj).getColor()) && this.getSize() == ((Bottle) obj).getSize();
	}
	
	@Override
	public int hashCode() {
		return (this.getSize()+this.getColor()).hashCode();
	}
}
