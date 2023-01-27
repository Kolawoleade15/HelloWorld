package introtojava;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		int a = 0;
		int b = 1;
		System.out.println("Enter the number of Fibonacci sequence: ");
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		System.out.println(a);
		System.out.println(b);
		System.out.print("Fibonacci Series:");
		for (int i = 0; i < n; i++)
		{
			int c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}

	}

}
