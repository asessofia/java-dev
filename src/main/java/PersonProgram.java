package main.java;

public class PersonProgram extends MiniProgram {
	
	@Override
	public void execute() {
		Person personObject = new Person();
		int x = 100;
		int y = 250;
		personObject.setHeight(x);
		personObject.setWeight(y);
		System.out.println("Person Height: " + personObject.getHeight());
		System.out.println("Person Weight: " + personObject.getWeight());
		
		personObject.setHairColor("Blue");
		System.out.println("Person Hair Color: " + personObject.getHairColor());
	}
}
