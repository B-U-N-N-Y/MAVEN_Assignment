package Com.Fibonacci;

import java.util.*;

public class Fibo_Operation {
	Scanner scan = new Scanner(System.in);
	int limit;

	public void fiboFind() {
		/*
		 * In this Method we find the Fabonacci series.
		 * @param input takes the input from the user
		 * @return Nothing
		 */
		
		//Printing Message
		System.out.print("Enter the Highest limit of Your Fibonacci series= ");
		limit = scan.nextInt();
		
		/*
		 * @param first_element is used to store previous values of the series
		 * @param second_element is used to store next value of the series
		 */
		
		//Assigning Values
		int first_element = 0;
		int Second_element = 1;
		
		//Printing Message
		System.out.print("Your Fibonacci series= ");
		
		//Assigning Values
		int index = 0;
		int sum_of_prev_element=0;
		

		/*In while loop, storing previous summation in sum_of_prev_element.
		 *Giving second_element value to the first_element
		 *and sum_of_prev_element value to the Second_element variable  
		 */
		while (index < limit) {
			System.out.print(first_element + " ");
			sum_of_prev_element = first_element + Second_element;
			first_element = Second_element;
			Second_element = sum_of_prev_element;
			index++;
		}
		System.out.println();
		System.out.println("------------------------------------");

	}
}
