package com.bridgelab;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckMobileNum {
	public static boolean isValidMobileNo(String str)  
	{  
	
	Pattern ptrn = Pattern.compile("(0/91)?[7-9]{1}[0-9]{9}");  
	Matcher match = ptrn.matcher(str);  
	return (match.find() && match.group().equals(str));  
	}  
	public static void main(String args[])  
	{  
	String str = "9800088899";  
	if (isValidMobileNo(str))  
	System.out.println("It is a valid mobile number.");   
	else  
	System.out.println("Entered mobile number is invalid.");      
	}  

}
