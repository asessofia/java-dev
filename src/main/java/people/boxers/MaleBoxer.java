package main.java.people.boxers;

import main.java.Person;
import main.java.PersonInfo;
import main.java.people.Male;

public class MaleBoxer extends Male {

	public MaleBoxer() {

	}

	// TASK 1: COMPLETE THIS METHOD
	/**
	 * Method calculates weight based on the following: 0 <= weight < 125 ->
	 * featherweight 125 <= weight < 135 -> lightweight 135 <= weight < 150 ->
	 * middleweight 150 <= weight <= 175 -> welterweight 175+ -> heavyweight
	 * 
	 * @param weight
	 * @return
	 */
	private String calculateWeightClass(int weight) {
		// Compound if/else statement

		if (weight < 125) {
			return "featherweight";
		}

		else if (weight >= 125 && weight < 135) {
			return "lightweight";
		}

		else if (weight >= 135 && weight < 150) {
			return "middleweight";
		}

		else if (weight >= 150 && weight <= 175) {
			return "welterweight";

		}

		else {
			return "heavyweight";
		}

	}

	public MaleBoxer(int height, int weight, String hairColor, PersonInfo personInfo) {
		// TODO: FInish this by calling the super type constructor
		super(height, weight, hairColor, personInfo);
		
		// implement male and set the weight
		this.setWeight(weight);
	}

	// TASK 2: Implement the other two constructors

	public MaleBoxer(int weight, String hairColor, String firstName, String lastName) {
		super(weight, hairColor, firstName, lastName);
		this.setWeight(weight);
	}
	
	public MaleBoxer(int weight, PersonInfo personInfo) {
		super(personInfo.getFirstName(), personInfo.getMiddleInitial(), personInfo.getLastName());
		this.setWeight(weight);
	}

	// TASK 3: Write a function that allows you to get the weight class
	
	public String getWeightClass()
	{
		return calculateWeightClass(getWeight());
	}

	// TASK 4: Refer to PersonProgram.java for remaining tasks
	
}
