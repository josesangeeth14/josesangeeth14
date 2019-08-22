package org.java.codes;

public class ReverseString {
	private void reverse() {
		String s = "Sangeeth";
		String r ="";
		
		for(int i=s.length()-1; i>=0 ;i--)
		{
			char ch = s.charAt(i);
			r = r+ch;
		}
		
		System.out.println("The Reversed String is "+r);
	}
	
	public static void main(String[] args) {
		ReverseString obj = new ReverseString();
		obj.reverse();
	}
}
