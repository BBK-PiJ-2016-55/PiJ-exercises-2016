public class SupermarketQueue implements PersonQueue {
	
	private Person firstPerson = null;
		
	// adds person to queue, after checking if list is empty
	public void insert(Person person){
		if (firstPerson == null) {
				firstPerson = person;
				return;
			}
		
		Person current = firstPerson;
		while (current.getNextPerson() != null) {
			// this means we are not yet at the end of the list
			current = current.getNextPerson();
		} 
		// Adds person to the end of the queue
		current.setNextPerson(person);	
		
	}
	
	// Retrieves person from queue
		public Person retrieve(){
		if (firstPerson == null) {
			// Check if queue is empty - no-one to serve
			System.out.println("No-one to retrieve");
			return null;
		}
		
		Person current = firstPerson;
		firstPerson = current.getNextPerson();
		return current;
		
	}
}