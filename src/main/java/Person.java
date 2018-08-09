package main.java;

public class Person {

	private int height;
	private int weight;
	private String hairColor;
	private String gender;
	private PersonInfo personInfo;
	
	public Person() {
		
	}
	
	public Person(int height, int weight, String hairColor, String gender, PersonInfo personInfo) {
		this.setHeight(height);
		this.setWeight(weight);
		this.setHairColor(hairColor);
		this.setGender(gender);
		this.setPersonInfo(personInfo);
	}
	
	public Person(int weight, String hairColor, String gender, String firstName, String lastName) {
		this.setWeight(weight);
		this.setHairColor(hairColor);
		this.setGender(gender);
		this.setPersonInfo(new PersonInfo(firstName, lastName));
	}
	
	public Person(String firstName, String middleInitial, String lastName) {
		this.setPersonInfo(new PersonInfo(firstName, middleInitial, lastName));
	}


	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public PersonInfo getPersonInfo() {
		return personInfo;
	}

	public void setPersonInfo(PersonInfo personInfo) {
		this.personInfo = personInfo;
	}

}
