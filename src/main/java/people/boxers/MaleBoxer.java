package main.java.people.boxers;

import main.java.PersonInfo;
import main.java.people.Male;

public class MaleBoxer extends Male {
	
	private String weightClass;
	
	// TASK 1: COMPLETE THIS METHOD
	/**
	 * Method calculates weight based on the following:
	 * 0 <= weight < 125 -> featherweight
	 * 125 <= weight < 135 -> lightweight
	 * 135 <= weight <= 150 -> middleweight
	 * 150 <= weight <= 175 -> welterweight
	 * 175+ -> heavyweight 
	 * @param weight
	 * @return
	 */
	private String calculateWeightClass(int weight) {
		// Compound if/else statement
		return "STUB";
	}
	
	public MaleBoxer(int height, int weight, String hairColor, PersonInfo personInfo) {
		
		// TODO: FInish this by calling the super type constructor
		
		
		// implement male and set the weight
		this.setWeight(weight);
	}
	
	// TASK 2: Implement the other two constructors
	
	// TASK 3: Write a function that allows you to get the weight class
	
	// TASK 4: Refer to PersonProgram.java for remaining tasks
}
