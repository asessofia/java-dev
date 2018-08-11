package main.java;
import main.java.people.Female;
import main.java.people.Male;
import main.java.people.boxers.MaleBoxer;

public class PersonProgram extends MiniProgram {

	public void outputPersonInfo(PersonInfo person) {

		this.outputField("Person's First Name", person.getFirstName());
		this.outputField("Person's Middle Initial", person.getMiddleInitial());
		this.outputField("Person's Last Name", person.getLastName());
		System.out.println("");
	}

	public void outputPerson(Person person) {
		if (person.getHeight() != 0) {
			this.outputField("Height", person.getHeight());
		}

		if (person.getWeight() != 0) {
			this.outputField("Weight", person.getWeight());
		}

		if (person.getHairColor() != null) {
			this.outputField("Hair Color", person.getHairColor());
		}

		if (person.getGender() != null) {
			this.outputField("Gender", person.getGender());
		}
		
		if (person.getPersonInfo() != null) {
			this.outputPersonInfo(person.getPersonInfo());
		}

		System.out.println("");
	}

	@Override
	public void execute() {
		
		
		PersonInfo personInfoObject = new PersonInfo();
		String x = "John";
		String y = "A";
		String Z = "Smith";
		personInfoObject.setFirstName(x);
		personInfoObject.setMiddleInitial(y);
		personInfoObject.setLastName(Z);
		
		Person person = new Person();
		person.setHeight(250);
		person.setWeight(250);
		person.setHairColor("Blue");
		person.setGender("Male");
		
		
		Person person1 = new Person(250, 125, "Green", "Martian", personInfoObject);
		Person person2 = new Person(125, "Orange", "Female", "Jim", "Thorton");
		Person person4 = new Person("Alex", "B", "Max");
		
		outputPerson(person);
		outputPerson(person1);
		outputPerson(person2);
		outputPerson(person4);


		this.outputPersonInfo(personInfoObject);

		PersonInfo personInfoObject2 = new PersonInfo("Jon", "A", "Howard");
		this.outputPersonInfo(personInfoObject2);

		PersonInfo personInfoObject3 = new PersonInfo("Jane", "C", "Doe");
		this.outputPersonInfo(personInfoObject3);
		
		Female female = new Female("Ann", "C", "Coulter");
		this.outputPerson(female);
		
		//int height, int weight, String hairColor, PersonInfo personInfo
		Male male = new Male(6, 200, "dark", new PersonInfo("Matthew", "W", "Mills"));
		this.outputPerson(male);
		
		// TASK 4: Create a few male boxer objects of varying weight classes
		// TASK 5: Output the person + the weightclass using an additional method, "outputMaleBoxer"
		//		Note: You should call this.outputPerson(...) on the male boxer object before outputting the weight class
		
		// example:
		
		// given:
		MaleBoxer boxer = new MaleBoxer(100, 128, "Dark Brown", new PersonInfo("Jeff", "C", "Gordon"));
		// and calling this.outputBoxer(boxer);
		
		// should produce:
		
//		Height: 100
//		Weight: 129
//		Hair Color: Dark Brown
//		Gender: Male
//		Person's First Name: Jeff
//		Person's Middle Initial: C
//		Person's Last Name: Gordon
//		Weight Class: Lightweight
	}
}
