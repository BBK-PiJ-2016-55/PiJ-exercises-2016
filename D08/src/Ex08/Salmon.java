package Ex08;

public class Salmon extends AquaticAnimal implements EggLayer {

  Salmon(String name) {
    super(name);
  }

  @Override
  public void layEggs() {
    System.out.println(getName() + " is laying eggs.");
  }

  @Override
  public void makeSound() {
    System.out.println("Bip bip bip bip");
  }

  @Override
  public void reproduce() {
    layEggs();
  }
}
