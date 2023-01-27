
import java.util.Scanner;


public class NegNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner user = new Scanner(System.in);
		System.out.print("Please enter a number :  ");
		int userInput = user.nextInt();
		
		if (userInput > 0) {
			System.out.print(userInput + "is a positive number ");
		}else if (userInput < 0) {
			System.out.print(userInput + "is a negative number");
			
		}
		
		else {
			System.out.print(userInput + " is zero");
		}
	}
}