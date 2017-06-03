package Ex08;

public class Dolphin extends AquaticAnimal implements Mammal  {

  public Dolphin(String name) {
    super(name);
  }

  @Override
  public void reproduce() {
    giveBirth();
  }

  @Override
  public void makeSound() {
    System.out.println("SQQUUUEEEEEEEEEEEEEEEE");
  }

  @Override
  public void giveBirth() {
    System.out.println(getName() + " is giving birth.");
  }
}
