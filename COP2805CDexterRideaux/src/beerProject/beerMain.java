package beerProject;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class beerMain {
		public static void main(String[] args) {
		
		/* System Inquiries and variable callouts*/
		int beerCans = beerMethods.beerCan("How many beer cans do you consume in a day?");
		double beerCost = beerMethods.beerCost("How much does each beer can cost?");
		
		/* Calculating costs based on user inputs */
		double totalBeerCostPerDay = beerCost * beerCans;
		double totalBeerCostPerYear = totalBeerCostPerDay * 365;
		double totalBeerCansPerYear = beerCans * 365;
		double beerCanCalories = totalBeerCansPerYear * 150;
		double beerCanPounds = beerCanCalories / 3500;
		/* Formatting calculations into decimals (rounded 2 spaces) */
		DecimalFormat beerRounding = new DecimalFormat("#,###.##");
		
		/* System Output */
		System.out.println("You have consumed " + beerCans + " beer cans per day.");
		System.out.println("You spend $" + beerRounding.format(totalBeerCostPerDay) + " on beer cans every day.");
		System.out.println("You consume a total of " + totalBeerCansPerYear + " beer cans every year");
		System.out.println("You spend a total of $" + beerRounding.format(totalBeerCostPerYear) + " on beer cans every year.");
		System.out.println("You gain " + beerRounding.format(beerCanCalories) + " calories in beer cans each year.");
		System.out.println("You gain " + beerRounding.format(beerCanPounds) + " pounds per year in beer cans alone.");
		
		} //end of main

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}// end of class (beerMain)
