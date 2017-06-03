package Ex08;

public class Crocodile extends AquaticAnimal implements EggLayer {

  public Crocodile(String name) {
    super(name);
  }

  @Override
  public void layEggs() {
    System.out.println(getName() + " is laying eggs.");
  }

  @Override
  public void makeSound() {
    System.out.println("RAWR");
  }

  @Override
  public void reproduce() {
    layEggs();
  }
}
