package com.test;

public class InsertIntoVpn2 
{
	public static void main(String[] args) 
	{
		String str = "DEVICE_VIEW_APP.DEVICE_PATCH_SEQ.NEXTVAL, 1, i_org_id, i_device_id, systimestamp, systimestamp, tmp_patch_data_rec.patch_id, tmp_patch_data_rec.is_missing_patch, tmp_patch_data_rec.patch_security_bulletin";
		str = str.replaceAll(" ", "");
		String[] strArr = str.split(",");
		String newString = "";
		for(int i=0;i<strArr.length;i++)
		{
			strArr[i] = "'"+strArr[i]+":'  || " + strArr[i] + " || "; 
			newString = newString + strArr[i];
		}
		System.out.println(newString);
	}
}
