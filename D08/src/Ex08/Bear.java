package Ex08;

public class Bear extends LandAnimal implements Mammal {

  public Bear(String name) {
    super(name);
  }

  @Override
  public void giveBirth() {
    System.out.println(getName() + " is giving birth.");
  }

  @Override
  public void makeSound() {
    System.out.println("ROOOOARRRRRRRR");
  }

  @Override
  public void reproduce() {
    giveBirth();
  }
}
