package org.java.codes;

public class PrimeNumber {
	public void prime()
	{
		System.out.println("First 20 prime numbers are:");
		int count;
		for (int i = 1; i <= 20; i++) {
		count = 0;
		for (int j = 2; j <= i / 2; j++) {
		if (i % j == 0) {
		count++;
		}
		}
		if (count == 0) {
		System.out.println(i);
		}
		}
	}
	public static void main(String[] args) {
		PrimeNumber p = new PrimeNumber();
		p.prime();
	}
}
