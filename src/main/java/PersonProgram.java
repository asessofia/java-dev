package main.java;

public class PersonProgram extends MiniProgram {

	public void outputPerson(PersonInfo person) {

		this.outputField("Person's First Name", person.getFirstName());
		this.outputField("Person's Middle Initial", person.getMiddleInitial());
		this.outputField("Person's Last Name", person.getLastName());
		System.out.println("");
	}

	@Override
	public void execute() {
		PersonInfo personObject = new PersonInfo();
		String x = "John";
		String y = "A";
		String Z = "Smith";
		personObject.setFirstName(x);
		personObject.setMiddleInitial(y);
		personObject.setLastName("Smith");

		this.outputPerson(personObject);

		PersonInfo personObject2 = new PersonInfo("Jon", "A", "Howard");
		this.outputPerson(personObject2);

		PersonInfo personObject3 = new PersonInfo("Jane", "C", "Doe");
		this.outputPerson(personObject3);
	}
}
