package Com.Prime;

import java.util.*;

public class Prime_Operation {

	int user_input;
	Scanner scan = new Scanner(System.in);

	
	public void primeFind() {
		System.out.print("Enter your number = ");
		user_input = scan.nextInt();
		while (1 > 0) {
			user_input++;
			int flag = 0;
			for (int index = 2; index <= user_input / 2; index++) {
				if (user_input % index == 0) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println("the next prime number is= " + user_input);
				System.out.println("------------------------------------");
				break;
			}
		}

	}

}
