package Com.Menu.Driven.Inputs;

import java.util.Scanner;

public class View {

	private int user_choice;
	Scanner scan = new Scanner(System.in);

	/*
	 * @param user_choice: This is parameter used for storing input from the user
	 */
	public void setUser_Choice(int user_choice) {

		this.user_choice = user_choice;
	}

	
	public void menu() {
		/*
		 * This is menu Method, showing the Menu Option for the User. 
		 * @return Nothing.
		 * */

		System.out.println("******* Menu: Select the program you want to do*******" + "\n1.Find the Factorial "
				+ "\n2.Find the Next Prime Number" + "\n3.Display Fibonacci Series " + "\n4.Exit");
	}

	// @return the user input to further work
	public int getUser_choice() {
		return user_choice;
	}

}
