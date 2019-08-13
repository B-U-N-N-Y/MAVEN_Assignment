package Com.Menu.Driven.Main;

import Com.Menu.Driven.Controller.Controller;
import Com.Menu.Driven.Inputs.View;
import java.util.*;

public class Menu {

	/**
	 * @author Arjun Santra
	 * @since 07/25/2019
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			do {
				// Create the view class object
				View view = new View();

				// call the menu method of view class
				view.menu();

				// Take the input from the user and send it to view object
				System.out.print("Enter your choice = ");
				view.setUser_Choice(scan.nextInt());

				/*
				 * create the controller object and call control method of controller object
				 */
				Controller controller = new Controller(view.getUser_choice());
				controller.control();
			} while (1 > 0);

		} catch (Exception e) {
			System.out.println("You given a invalid input program will terminated deu to invalid input");
			System.out.println("------------------------------------");

		}

	}

}
