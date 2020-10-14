package lab5;

import java.util.Scanner;

public class lab5 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int userNumber = 0;
		String userDecision = "";

		do {
			System.out.println("Enter a whole number between 1 and 10:");
			userNumber = scnr.nextInt();
			
			while((userNumber < 1 || userNumber > 10))
	        {
	            System.out.print("Invalid number. Please enter a whole number between 1 and 10:");	            
				userNumber = scnr.nextInt();
	        }
			
			long factorialNumber = 1;
			for (int i = 1; i <= userNumber; i++) {
				factorialNumber = factorialNumber * i;
			}
			System.out.println("Factorial of " + userNumber + " is: " + factorialNumber);

			System.out.println("Would you like to continue? (y/n)");
			userDecision = scnr.next();
			
		} while (userDecision.equals("y"));
		System.out.println("Goodbye!");

	}
}
