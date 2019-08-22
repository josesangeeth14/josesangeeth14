package org.java.codes;

public class Fibonacci {
	private void fibo() {
		// TODO Auto-generated method stub
		int n=10,t1=0,t2=1;
		int sum=0;
		System.out.println(t1);
		System.out.println(t2);
		for(int i=1;i<=n-2;i++)
		{
			
			sum = t1+t2;
			t1=t2;
			t2=sum;
			System.out.println(sum);
		}
	}
	
	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		f.fibo();
	}
}
