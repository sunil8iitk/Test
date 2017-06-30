package com.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapEntryLong 
{
	public static void main(String[] args) 
	{
		Student sunil = new Student(1, "msk");
		Student saiKrishna = new Student(2, "gsk");
		Student naresh = new Student(3, "ngk");
		Student kishore = new Student(4, "nbk");
		
		HashMap<Integer, Student> studentMap= new HashMap<Integer, Student>();
		studentMap.put(sunil.getId(), sunil);
		studentMap.put(saiKrishna.getId(), saiKrishna);
		studentMap.put(naresh.getId(), naresh);
		studentMap.put(kishore.getId(), kishore);
		
		System.out.println(studentMap);
		
		Set<Student> studentSet = new HashSet<Student>();
		studentSet.addAll(studentMap.values());
		System.out.println(studentSet);
		
		studentMap.remove(naresh.getId());
		studentMap.remove(kishore.getId());
		
		System.out.println(studentMap);
		System.out.println(studentSet);

		studentSet.remove(studentSet.toArray()[0]);
		System.out.println(studentSet);
		System.out.println(studentMap);
		

		
	
	}
}

class Student
{
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void setName(String name) {
		this.name = name;
	}
	int id;
	String name;
	
	
	@Override
	public String toString() {
		return this.id + "," + this.name;
	}
}