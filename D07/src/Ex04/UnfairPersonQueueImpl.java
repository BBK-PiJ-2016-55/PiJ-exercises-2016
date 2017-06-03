package Ex04;

/**
 * Implements PersonQueue so that the person at the end
 * (i.e. the person that is retrieved next time the method retrieve() is called)
 * is always the oldest person
 */
public class UnfairPersonQueueImpl implements PersonQueue {

  private Person firstPerson = null;

  @Override
  public void insert(Person person) {

    // adds person to queue, after checking if list is empty
    if (firstPerson == null) {
      firstPerson = person;
      return;
    }

    // If the current first person is younger than new person, insert new person
    // at head of queue
    if (firstPerson.getAge() < person.getAge()) {
      person.setNextPerson(firstPerson);
      firstPerson = person;
      return;
    }

    // Otherwise, cycle through rest of queue and insert new person
    // before the first person younger than them found
    Person current = firstPerson;
    while (current.getNextPerson() != null) {
      if (current.getNextPerson().getAge() < person.getAge()) {
        person.setNextPerson(current.getNextPerson());
        current.setNextPerson(person);
        return;
      } else {
        current = current.getNextPerson();
      }
    }
    // If this line is reached, it means the new person is younger than anyone
    // else in the queue, so they get added to the end
    current.setNextPerson(person);
  }

  @Override
  public Person retrieve() {
    if (firstPerson == null) {

      System.out.println("No-one to retrieve");
      return null;
    }

    Person current = firstPerson;
    firstPerson = current.getNextPerson();
    return current;
  }
}
