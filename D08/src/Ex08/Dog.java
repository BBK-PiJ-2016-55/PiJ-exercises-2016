package Ex08;

public class Dog extends LandAnimal implements Mammal {

  public Dog(String name) {
    super(name);
  }

  @Override
  public void giveBirth() {
    System.out.println(getName() + " is giving birth.");
  }

  @Override
  public void makeSound() {
    System.out.println("Woof");
  }

  @Override
  public void reproduce() {
    giveBirth();
  }
}
