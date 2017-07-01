package com.simple;

import java.util.HashMap;
import java.util.Map;


public class MapCopy 
{
	public static void main(String[] args) 
	{
		SavedSearch s1 = new SavedSearch(3256, 123);
		SavedSearch s2 = new SavedSearch(3257, 124);
		SavedSearch s3 = new SavedSearch(3258, 125);
		
		Map<Integer, SavedSearch> savedSearchPolicyMap = new HashMap<Integer, SavedSearch>();
		savedSearchPolicyMap.put(s1.getSsAssoc_ID(), s1);
		savedSearchPolicyMap.put(s2.getSsAssoc_ID(), s2);
		savedSearchPolicyMap.put(s3.getSsAssoc_ID(), s3);
		
		System.out.println(savedSearchPolicyMap);
		
		Map<Integer,Integer> windowsMap = new HashMap<Integer, Integer>();
		windowsMap.put(s1.getPolId(), s1.getSsAssoc_ID());
		windowsMap.put(s2.getPolId(), s2.getSsAssoc_ID());
		windowsMap.put(s3.getPolId(), s3.getSsAssoc_ID());
		
		System.out.println(windowsMap);
		
		windowsMap.remove(windowsMap.keySet().toArray()[0]);
			
		System.out.println(" ========== ");
		System.out.println(windowsMap);
		System.out.println("############");
		System.out.println(savedSearchPolicyMap);
		
	}
}

class SavedSearch 
{
	private int ssAssoc_ID;
	private int polId;
	public SavedSearch(int ssAssoc_ID, int polId) {
		super();
		this.ssAssoc_ID = ssAssoc_ID;
		this.polId = polId;
	}
	public int getSsAssoc_ID() {
		return ssAssoc_ID;
	}
	public void setSsAssoc_ID(int ssAssoc_ID) {
		this.ssAssoc_ID = ssAssoc_ID;
	}
	public int getPolId() {
		return polId;
	}
	public void setPolId(int polId) {
		this.polId = polId;
	}
	
	@Override
	public String toString() {
		return this.getPolId() + " : " + this.getSsAssoc_ID();
	}
}
