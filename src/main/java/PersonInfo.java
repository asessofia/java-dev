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

public class PersonInfo {

	// DATA (owned by the instance of the class -- member variables)
	private String firstName;
	private String middleInitial;
	private String lastName;
	
	// CONSTRUCTOR (MANY CAN BE DEFINED, AS LONG AS PARAMETERS + TYPES ARE DIFFERENT)
	public PersonInfo(String firstName, String middleInitial, String lastName) {
		this.setFirstName(firstName);
		this.setMiddleInitial(middleInitial);
		this.setLastName(lastName);
	}
	
	public PersonInfo(String firstName, String lastName) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
	}
	

	// need to define default constructor if you define a constructor and still want the default
	public PersonInfo() { }
	

	// MUTATOR (ALLOWS MODIFICATION OF PRIVATE DATA)
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	// ACCESSOR (ALLOWS ACCESS TO PRIVATE DATA)
	public String getFirstName(){
		return this.firstName;
	}

	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}

	public String getMiddleInitial() {
		return this.middleInitial;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
