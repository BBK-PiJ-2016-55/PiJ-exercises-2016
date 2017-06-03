package Ex08;

public class Monkey extends LandAnimal implements Mammal {

  public Monkey(String name) {
    super(name);
  }

  @Override
  public void giveBirth() {
    System.out.println(getName() + " is giving birth.");
  }

  @Override
  public void makeSound() {
    System.out.println("Oook ook ook ooooook!");
  }

  @Override
  public void reproduce() {
    giveBirth();
  }
}
