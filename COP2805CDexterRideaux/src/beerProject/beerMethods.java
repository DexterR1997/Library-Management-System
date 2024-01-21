package beerProject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class beerMethods {
		
	static Scanner inputBeerCan = new Scanner(System.in);
	public static int beerCan(String mess) {
		int result = 0;
		boolean badValue = true;
		do {
			try {
				System.out.println(mess);
				result = inputBeerCan.nextInt();
				badValue = false;
			}catch(InputMismatchException ime) {
				System.out.println("Invalid Input! Please try again.");
				badValue = true;
				inputBeerCan.next(); //clears out keyboard buffer
			}//end tryCatch
		} while(badValue);
		return result;
	} //end beerCan
	
	static Scanner inputBeerCost = new Scanner(System.in);
	public static double beerCost(String mess) {
		double result = 0;
		boolean badValue = true;
		do {
			try {
				System.out.println(mess);
				result = inputBeerCost.nextDouble();
				badValue = false;
			}catch(InputMismatchException ime) {
				System.out.println("Invalid Input! Please try again.");
				badValue = true;
				inputBeerCost.next(); //clears out keyboard buffer
			}//end tryCatch
		} while(badValue);
		return result;
	} //end beerCost

	}