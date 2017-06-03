package Ex02;

public class Supermarket {
    public static void main(String[] args){
		
		PersonQueue myQueue = new PersonQueueImpl();
		
		Person personOne = new Person("Doris");
		myQueue.insert(personOne);

		Person personTwo = new Person("Malcolm");
		myQueue.insert(personTwo);

		Person personThree = new Person("Bob");
		myQueue.insert(personThree);

		Person nextCustomer = myQueue.retrieve();
		System.out.println(nextCustomer.getPersonName() + " retrieved from queue.");
		nextCustomer = myQueue.retrieve();
		System.out.println(nextCustomer.getPersonName() + " retrieved from queue.");
		nextCustomer = myQueue.retrieve();
		System.out.println(nextCustomer.getPersonName() + " retrieved from queue.");
	}
}