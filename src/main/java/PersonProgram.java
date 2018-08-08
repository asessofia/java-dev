package main.java;

public class PersonProgram extends MiniProgram {

	public void outputPerson(Person person) {

		this.outputField("Person's First Name", person.getFirstName());
		this.outputField("Person's Middle Initial", person.getMiddleInitial());
		this.outputField("Person's Last Name", person.getLastName());
		System.out.println("");
	}

	@Override
	public void execute() {
		Person personObject = new Person();
		String x = "John";
		String y = "A";
		String Z = "Smith";
		personObject.setFirstName(x);
		personObject.setMiddleInitial(y);
		personObject.setLastName("Smith");

		this.outputPerson(personObject);

		Person personObject2 = new Person("Jon", "A", "Howard");
		this.outputPerson(personObject2);

		Person personObject3 = new Person("Jane", "C", "Doe");
		this.outputPerson(personObject3);
	}
}
