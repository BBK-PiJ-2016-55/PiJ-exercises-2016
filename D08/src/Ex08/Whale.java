package Ex08;

public class Whale extends AquaticAnimal implements Mammal  {

  Whale(String name) {
    super(name);
  }

  @Override
  public void reproduce() {
    giveBirth();
  }

  @Override
  public void makeSound() {
    System.out.println("OOOAAAWOOOOOOOOOOOOOOOOOEEEEEEEEEE");
  }

  @Override
  public void giveBirth() {
    System.out.println(getName() + " is giving birth.");
  }
}
