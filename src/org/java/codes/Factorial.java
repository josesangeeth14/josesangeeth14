package org.java.codes;

public class Factorial {
	public static void fact()
	{
		int fact=1,n=5;
		for(int i=1;i<=5;i++)
		{
			fact = fact*i;			
		}
		System.out.println("factorial of 5 is "+fact);
	}
	public static void main(String[] args) {
		Factorial obj = new Factorial();
		obj.fact();
	}
}
