package org.java.codes;

public class Palindrome {
	private void palin() {
		String s = "madam";
		String r ="";
		
		for(int i=s.length()-1; i>=0 ;i--)
		{
			char ch = s.charAt(i);
			r = r+ch;
		}
		
		if(s.equals(r))
		{
			System.out.println("It is palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
	}
	
	public static void main(String[] args) {
		Palindrome obj = new Palindrome();
		obj.palin();
	}
}
