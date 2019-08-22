package org.java.codes;

public class StarPattern {
	private void pattern() {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		StarPattern obj = new StarPattern();
		obj.pattern();
	}
}
