package main.java;

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
