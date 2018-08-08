package main.java;

public class Person {

	// member variables (owned by the instance of the class)
	private int height;
	private int weight;
	private String hairColor;
	
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
