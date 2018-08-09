package main.java.people;

import main.java.Person;
import main.java.PersonInfo;

public class Female extends Person {
	
	private static final String GENDER = "FEMALE";
	
	public Female(int height, int weight, String hairColor, PersonInfo personInfo) {
		// use an extended type's constructor using the keyword "super"
		super(height, weight, hairColor, GENDER, personInfo);
	}
	
	public Female(int weight, String hairColor, String firstName, String lastName) {
		super(weight, hairColor, GENDER, firstName, lastName);
	}
	
	public Female(String firstName, String middleInitial, String lastName) {
		super(firstName, middleInitial, lastName);
		this.setGender(GENDER);
	}
}
