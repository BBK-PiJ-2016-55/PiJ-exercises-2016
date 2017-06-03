package Ex08;

public class Cat extends LandAnimal implements Mammal {

  Cat(String name) {
    super(name);
  }

  @Override
  public void giveBirth() {
    System.out.println(getName() + " is giving birth.");
  }

  @Override
  public void makeSound() {
    System.out.println("Meow?");
  }

  @Override
  public void reproduce() {
    giveBirth();
  }
}
