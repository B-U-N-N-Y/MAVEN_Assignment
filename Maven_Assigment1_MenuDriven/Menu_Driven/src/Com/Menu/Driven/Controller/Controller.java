package Com.Menu.Driven.Controller;

import Com.Fact.Fact_Operation;
import Com.Fibonacci.Fibo_Operation;
import Com.Prime.Prime_Operation;

public class Controller {

	private int user_Menu_Selection;

	// set the user input by calling controller method
	public Controller(int user_Menu_Selection) {
		this.user_Menu_Selection = user_Menu_Selection;
	}

	/*
	 * control method to control the flow of program which task is going to happen
	 */
	public void control() {
		switch (user_Menu_Selection) {

		/*
		 * create Fact_Operation object then call the factFind method
		 */
		case 1:
			Fact_Operation fact = new Fact_Operation();
			fact.factFind();
			break;

		/*
		 * create Prime_Operation object then call the primeFind method
		 */
		case 2:
			Prime_Operation prime = new Prime_Operation();
			prime.primeFind();
			break;

		/*
		 * create Fibo_Operation object then call the fiboFind method
		 */
		case 3:
			Fibo_Operation fibo = new Fibo_Operation();
			fibo.fiboFind();
			break;

		// Stop the program and exit from the program
		case 4:
			System.out.println("PROGRAM EXIT");
			System.exit(0);

			// If user given any other input it show invalid input
		default:
			System.out.println("Enter valid Input");
			System.out.println("------------------------------------");

		}
	}

}
