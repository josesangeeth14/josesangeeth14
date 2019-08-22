package org.java.codes;

public class Ascending {
	private void ascend() {
		int a[] = {1,3,5,4,2};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.println("The ascending order is");
		
		for(int n:a)
		{
			System.out.println(n);
		}
		
	}
	
	public static void main(String[] args) {
		Ascending obj = new Ascending();
		obj.ascend();
	}
}
