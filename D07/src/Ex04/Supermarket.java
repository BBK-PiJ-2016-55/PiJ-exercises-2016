package Ex04;

public class Supermarket {
    public static void main(String[] args){
		
		PersonQueue myQueue = new UnfairPersonQueueImpl();

		Person personOne = new Person("Doris", 43);
		myQueue.insert(personOne);

		Person personTwo = new Person("Malcolm", 150);
		myQueue.insert(personTwo);

		Person personThree = new Person("Bob", 127);
		myQueue.insert(personThree);

		Person nextCustomer = myQueue.retrieve();
		System.out.println(nextCustomer.getPersonName() + " retrieved from queue.");
		nextCustomer = myQueue.retrieve();
		System.out.println(nextCustomer.getPersonName() + " retrieved from queue.");
		nextCustomer = myQueue.retrieve();
		System.out.println(nextCustomer.getPersonName() + " retrieved from queue.");
	}
}