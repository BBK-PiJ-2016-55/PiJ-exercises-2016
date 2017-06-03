package Ex02;

public class PersonQueueImpl implements PersonQueue {

  private Person[] queue = new Person[5];
  private int queueCounter = 0;
  private int nextCounter = 0;

  public void insert(Person person) {
    queue[queueCounter] = person;
    queueCounter++;
  }

  public Person retrieve() {
    if (queueCounter == 0) {
      return null;
    } else {
      Person retrieved = queue[nextCounter];
      nextCounter++;
      return retrieved;
    }
  }

}