package org.java.codes;

public class Fib {
	public static void fact()
	{
		int fact=1,n=5,i=1;
		do
		{
			fact = fact*i;
			i++;
		}while(i<=5);
		System.out.println("factorial of 5 is "+fact);
		
	}
	public static void main(String[] args) {
		Fib obj = new Fib();
		obj.fact();
	}
}
