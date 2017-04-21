package Ex04_1;

public class Person {
	private String name;
	private Person nextPerson;

	public Person(String name) {
		this.name = name;
		this.nextPerson = null;
	}
	
	public void setNextPerson(Person newPerson) {
		this.nextPerson = newPerson;	
	}

	public String getPersonName() {
		return this.name;
	}
	
	public Person getNextPerson() {
		return this.nextPerson;	
	}
	
}