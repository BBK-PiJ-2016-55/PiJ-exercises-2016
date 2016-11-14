public class Supermarket {
    public static void main(String[] args){
		
		SupermarketQueue myQueue = new SupermarketQueue();
		
		Person personOne = new Person("Doris");
		myQueue.insert(personOne);
		
		Person personTwo = new Person("Malcolm");
		myQueue.insert(personTwo);
			
		Person personThree = new Person("Bob");
		myQueue.insert(personThree);
		
		myQueue.retrieve();
	
	}
}