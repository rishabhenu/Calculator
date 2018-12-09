package Calculator;
import java.math.*;
public class Operations {

	String sum(String a,String b)
	{
		return integer(a)+integer(b)+"";
	}
	
	String sub(String a,String b)
	{
		return integer(a)-integer(b)+"";
	}
	
	String mul(String a,String b)
	{
		return integer(a)*integer(b)+"";
	}
	
	String div(String a,String b)
	{
		return integer(a)/integer(b)+"";
	}
	
	private int integer(String s)
	{
		if(s.equalsIgnoreCase(""))
			return 0;
		else
			return Integer.parseInt(s);
	}
	
	
	public static void main(String args[])
	{	
		Operations obj=new Operations();
		
		String s="";
		
		System.out.println(obj.integer(s));
		System.out.println();
		
		String s1=" ";
		char c=(char)s1.charAt(0);
		System.out.println(c);
		
		System.out.println();
	}
	
}
