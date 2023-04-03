package introtojava;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number; ");
		int num = scanner.nextInt();
		int i = 1, fact = 1;
		while (i <= num) {
			fact = fact * i;
			i++;
		}

		System.out.println("Factoral of the number: " + fact);

	}

}
