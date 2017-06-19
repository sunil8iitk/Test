package com.test;

public class StringManip {

	public static void main(String[] args) 
	{
	
		process("calenderNext = 'next',calenderJanuary = 'Jan',calenderFebruary = 'Feb',calenderMarch = 'Mar',calenderApril = 'Apr',"
				+ "calenderMay = 'May',calenderJune = 'Jun',calenderJuly = 'Jul',calenderAugust = 'Aug',calenderSeptember = 'Sep',calenderOctober = 'Oct',calenderNovember = 'Nov',calenderDecember = 'Dec',calenderSunday = 'Sun',calenderMonday = 'Mon',calenderTuesday = 'Tue',calenderWednesday = 'Wed',calenderThursday = 'Thu',calenderFriday = 'Fri',calenderSaturday = 'Sat',"
				+ "calenderSu = 'Sun',calenderMo = 'Mon',calenderTu = 'Tue',calenderWe = 'Wed',calenderTh = 'Thu',calenderFr = 'Fri',calenderSa = 'Sat'");
	
	
		String str = " \"calenderPrev\" = \"<bc:message key='calenderPrev' />\", \"calenderNext\" = \"<bc:message key='calenderNext' />\", \"calenderJanuary\" = \"<bc:message key='calenderJanuary' />\", \"calenderFebruary\" = \"<bc:message key='calenderFebruary' />\", \"calenderMarch\" = \"<bc:message key='calenderMarch' />\", \"calenderApril\" = \"<bc:message key='calenderApril' />\", \"calenderMay\" = \"<bc:message key='calenderMay' />\", \"calenderJune\" = \"<bc:message key='calenderJune' />\", \"calenderJuly\" = \"<bc:message key='calenderJuly' />\", \"calenderAugust\" = \"<bc:message key='calenderAugust' />\", \"calenderSeptember\" = \"<bc:message key='calenderSeptember' />\", \"calenderOctober\" = \"<bc:message key='calenderOctober' />\", \"calenderNovember\" = \"<bc:message key='calenderNovember' />\", \"calenderDecember\" = \"<bc:message key='calenderDecember />\", \"calenderSunday\" = \"<bc:message key='calenderSunday' />\", \"calenderMonday\" = \"<bc:message key='calenderMonday' />\", \"calenderTuesday\" = \"<bc:message key='calenderTuesday' />\", \"calenderWednesday\" = \"<bc:message key='calenderWednesday' />\", \"calenderThursday\" = \"<bc:message key='calenderThursday' />\", \"calenderFriday\" = \"<bc:message key='calenderFriday' />\", \"calenderSaturday\" = \"<bc:message key='calenderSaturday' />\", \"calenderSu\" = \"<bc:message key='calenderSu' />\", \"calenderMo\" = \"<bc:message key='calenderMo' />\", \"calenderTu\" = \"<bc:message key='calenderTu' />\", \"calenderWe\" = \"<bc:message key='calenderWe' />\", \"calenderTh\" = \"<bc:message key='calenderTh' />\", \"calenderFr\" = \"<bc:message key='calenderFr' />\", \"calenderSa\" = \"<bc:message key='calenderSa' />\"";
		
		str = stringRemove(str);
		//str = insertNewLine(str);
		System.out.println(str);
		
	}
	
	
	public static String insertNewLine(String str)
	{
		return str.replaceAll(",", ",\n");
	}
	
	public static String stringRemove(String str)
	{
		str = str.replaceAll("=", ":");
		return str;
	}
	
	public static void process(String str)
	{
		String[] arr = str.split(",");
		for(int i=0;i<arr.length;i++)
		{
			String[] myArr = arr[i].split("=");
			arr[i] = myArr[0]+"= "+"parms"+'.'+myArr[0].replaceAll("\\s+","")+";";
			//System.out.println(arr[i]);
		}
		
	}
}
