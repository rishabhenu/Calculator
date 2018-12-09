package Calculator;

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
	
	private double integer(String s)
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
		
		System.out.println(obj.integer(s));
		
		String s1=" ";
		char c=(char)s1.charAt(0);
		System.out.println(obj.integer(String.valueOf(c)));
		
		System.out.println();
		
		String result=obj.div("4", "3");
		
		System.out.println(result);
	}
	
}