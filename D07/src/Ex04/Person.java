package Ex04;

public class Person {
	private String name;
	private Person nextPerson;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.nextPerson = null;
		this.age = age;
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

	public int getAge() {
		return age;
	}
}