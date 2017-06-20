package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 *  This class is for testing out Comparable and Comparator Interfaces: 
 */

public class ComparatorAndComparable 
{
	public static void main(String[] args) 
	{
		Car benz = new Car(1, "c100", "Mercedez", 40);
		Car maruti = new Car(2, "swift", "Suzuki", 8);
		Car audi = new Car(4, "A6", "Audi", 35);
		
		List<Car> carList = new ArrayList<>();
		carList.add(benz);
		carList.add(audi);
		carList.add(maruti);
		
		
		Collections.sort(carList);
		System.out.println(carList);
		Collections.sort(carList, Car.priceComparator);
		System.out.println(carList);
	}
}

class Car implements Comparable<Car>
{
	int id;
	String name;
	String company;
	int price;
	public Car(int id, String name, String company, int price) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public int compareTo(Car o) {
		return this.getId() - o.getId();
	}
	
	@Override
	public String toString() 
	{
		return this.getId() + ":" + this.getName() + ":" + this.getCompany() + " ";
	}
	
	public static Comparator<Car> priceComparator = new Comparator<Car>() {
		
		public int compare(Car o1, Car o2) {
			return o1.getPrice() - o2.getPrice();
		};
	};
}
