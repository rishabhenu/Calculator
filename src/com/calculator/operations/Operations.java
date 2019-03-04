package com.calculator.operations;

public class Operations {

	public String sum(String a,String b)
	{
		return stringToInteger(a)+stringToInteger(b)+"";
	}
	
	public String sub(String a,String b)
	{
		return stringToInteger(a)-stringToInteger(b)+"";
	}
	
	public String mul(String a,String b)
	{
		return stringToInteger(a)*stringToInteger(b)+"";
	}
	
	public String div(String a,String b)
	{
		return stringToInteger(a)/stringToInteger(b)+"";
	}
	
	private double stringToInteger(String s)
	{
		if(s.trim().equalsIgnoreCase(""))
			return 0;
		else
			return Double.parseDouble(s);
	}
	
	
	public static void main(String args[])
	{	
		Operations obj=new Operations();
		
		String s="";
		
		System.out.println(obj.stringToInteger(s));
		
		String s1=" ";
		char c=(char)s1.charAt(0);
		System.out.println(obj.stringToInteger(String.valueOf(c)));
		
		System.out.println();
		
		String result=obj.div("4", "3");
		
		System.out.println(result);
	}
	
}