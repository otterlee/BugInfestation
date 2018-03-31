package edu.handong.csee.java.lab06;
import java.util.Scanner;

/**
 * This program is that deal with given data so that find population and volume of bug and 
 * The given data are volume of a roach, starting roach population and rate of increase per week and volume of a house.
 * And we need to find number of weeks to exceed the capacity of the house and number and volume of roaches.
 * 
 *@author Sua Lee
 */

	/** This is main method, it calls method computeNumOfBugsToUseFkiller().
	 */

public class Cesco {
	final double GROWTH_RATE = 0.95;//declare the bug's GROWTH_RATE per week
	final double ONE_BUG_VOLUME =0.002;//declare the ONE_BUG_VOLUME
	//declare and the bug's GROWTH_RATE and ONE_BUG_VOLUME in 'final' because these are constants.
	
	
	/** This is a method that compute data about bugs.
	 */
	public void computeNumOfBugsToUseFkiller() { 
		
		Scanner keyboard = new Scanner(System.in);//instantiate Scanner
		System.out.println("<BUG INFESTATION>"); //print-out the program name
		System.out.print("Enter the house volume :"); //prompt to enter the house volume
		double houseVolume = keyboard.nextDouble();//take the input number and assign to houseVolume;
		
		System.out.print("Enter the start population of bug :");//prompt to enter the start population
		double startPopulation = keyboard.nextDouble();// take the number and assign to local variable startPopulation
		
		double population = startPopulation; //declare the population and initiate to startPopulation value
		double totalBugVolume = population * ONE_BUG_VOLUME;
		// declare the totalBugVolume and initiate to result of multiplying population and ONE_BUG_VOLUME
		
		int countWeeks = 0;//declare countWeeks and initiate to 0
		
		 while (totalBugVolume < houseVolume) // loop until before total bug's volume is larger than house volume
		 {
			double newBugs = population * GROWTH_RATE; 
			//declare newBugs in double and initiate to new population of bug according to GROWTH_RATE
		 	double newBugVolume = newBugs * ONE_BUG_VOLUME;
		 	//declare newBugVolume in double and initiate to result of multiplying newBugs and ONE_BUG_VOLUME
		 	population = population + newBugs; //add newBugs to population
		 	totalBugVolume = totalBugVolume + newBugVolume; //add newBugVolume to totalBugVolume
		 	countWeeks = countWeeks + 1;
		 	//GROWTH_RATE means bug's growth rate per 'week'. so after calculating population and voulume, add 1 to countWeeks. 
		 }
		 
		 System.out.println("startPop = "+startPopulation); //output the initial population
		 System.out.println("houseVol ="+ houseVolume); //output the volume of house
		 System.out.println("countWeek ="+countWeeks); //output the week count when the volume of bugs is larger than the volume of house
		 System.out.println("pop ="+(int)population); //output the population of bugs
		 System.out.println("total bug vol ="+(int)totalBugVolume); //casting totalBugVolume to integer and output the volume of total bugs
	}

	public static void main(String[] args) {
		Cesco myCesco = new Cesco(); //instantiate the Cesco to myCesco
		myCesco.computeNumOfBugsToUseFkiller(); 
		//execute the method to find the number of weeks to exceed the capacity of the house, and number and volume of roaches
	}
	
}
