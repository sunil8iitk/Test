package com.simple;

import java.util.ArrayList;
import java.util.Arrays;

public class SuperStack 
{
	public static void main(String[] args) 
	{
		System.out.println("Going to build a stack.");
		Stack testStack = new Stack();
		for(int i=0;i<10;i++)
		{
			testStack.push(i);
		}
		System.out.println(Arrays.toString(testStack.dataArr.toArray()));
	}
}


class Stack
{
	ArrayList<Integer> dataArr = new ArrayList<Integer>();
	
	public void push(int n)
	{
		dataArr.add(n);
		System.out.println("Pushed " + n + " into the Stack");
	}
	
	public int pop()
	{
		System.out.println("Popping from the Stack");
		int poppedElement = dataArr.get(0);
		dataArr.remove(0);
		return poppedElement;
	}
}
