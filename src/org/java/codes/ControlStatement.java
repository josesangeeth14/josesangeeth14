package org.java.codes;

public class ControlStatement {
	public void jose()
	{
		int age= -425;
		if(age>0 && age<18)
		{
			System.out.println("Minor");
		}
		else if(age>=18 && age<60)
		{
			System.out.println("Citizen");
		}
		else if(age>60 && age<=100)
		{
			System.out.println("Senior citizen");
		}
		else
		{
			System.out.println("invalid age");
		}
	}
	
	public static void main(String[] args) {
		ControlStatement obj = new ControlStatement();
		obj.jose();
	}
}
