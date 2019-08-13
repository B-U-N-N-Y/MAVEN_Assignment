package Com.Fact;

import java.math.BigInteger;
import java.util.*;

public class Fact_Operation {

	int user_input;

	Scanner scan = new Scanner(System.in);

	//factFind method to set the number and given the output
	public void factFind() {
		/*
		 * In this Method we find the factorial of a given number.
		 * @param input takes the input from the user 
		 * @return Nothing
		 */
		
		//Printing Message
		System.out.print("Enter the number for finding the factorial: ");
		user_input = scan.nextInt();
		String fact = facto(user_input);
		System.out.println("Factorial of " + user_input + " is = " + fact);
		System.out.println("------------------------------------");


	}

	// Using BigInteger to find the factorial for large numbers
	public static String facto(int user_input) {
		BigInteger fact = new BigInteger("1");
		for (int index = 1; index <= user_input; index++) {
			fact = fact.multiply(new BigInteger(index + ""));
		}
		return fact.toString();
	}
}