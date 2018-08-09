package main.java.people;

import main.java.Person;
import main.java.PersonInfo;

public class Male extends Person {

	private static String GENDER = "MALE";

	public Male() {

	}

	public Male(int height, int weight, String hairColor, PersonInfo personInfo) {
		super (height, weight, hairColor, GENDER, personInfo);
	}

	public Male(int weight, String hairColor, String firstName, String lastName) {
		super (weight, hairColor, GENDER, firstName, lastName);
	}

	public Male(String firstName, String middleInitial, String lastName) {
		super (firstName, middleInitial, lastName);
		this.setGender(GENDER);
	}
}