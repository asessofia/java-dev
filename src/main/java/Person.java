package main.java;

/*
 * ASSIGNMENT 1:
 * 
 *  A> Create a class called "PersonInfo" with field names for first name, middle initial, and last name with accessors and mutators
 *  Follow java conventions:
 *  	1. (lowerCamelCased for data, method names, method parameters, and variable declarations)
 * 		2. (UpperCamelCased for class names)
 * 
 *  B> Add PersonInfo as a data member in the Person class.  Create accessors and mutators.
 *  C> Create a constructor in the Person object that takes PersonInfo as a parameter.  
 *  D> Use the PersonProgram to output the person info along with all the other fields
 */

public class Person {

	// DATA (owned by the instance of the class -- member variables)
	private int height;
	private int weight;
	private String hairColor;
	private String gender;
	
	// CONSTRUCTOR (MANY CAN BE DEFINED, AS LONG AS PARAMETERS + TYPES ARE DIFFERENT)
	public Person(int height, int weight, String hairColor, String gender) {
		this.setHeight(height);
		this.setWeight(weight);
		this.setHairColor(hairColor);
		this.setGender(gender);
	}
	
	public Person(int weight) {
		this.setWeight(weight);
	}
	
	public Person(int weight, String hairColor, String gender){
		this.setWeight(weight);
		this.setHairColor(hairColor);
		this.setGender(gender);
	}
	// need to define default constructor if you define a constructor and still want the default
	public Person() { }
	

	// MUTATOR (ALLOWS MODIFICATION OF PRIVATE DATA)
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	// ACCESSOR (ALLOWS ACCESS TO PRIVATE DATA)
	public String getGender(){
		return this.gender;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}

	public String getHairColor() {
		return this.hairColor;
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
}
