package main.java;

public class PersonProgram extends MiniProgram {

	public void outputPerson(Person person) {
		if (person.getHeight() != 0) {
			this.outputField("Person Height", person.getHeight());
		}

		this.outputField("Person Weight", person.getWeight());
		this.outputField("Person Hair Color", person.getHairColor());
		this.outputField("Gender", person.getGender());
		System.out.println("");
	}

	@Override
	public void execute() {
		Person personObject = new Person();
		int x = 100;
		int y = 250;
		personObject.setHeight(x);
		personObject.setWeight(y);
		personObject.setHairColor("Blue");
		personObject.setGender("female");

		this.outputPerson(personObject);

		Person personObject2 = new Person(175, 250, "Green", "Martian");
		this.outputPerson(personObject2);

		Person personObject3 = new Person(250, "black", "male");
		this.outputPerson(personObject3);
	}
}
