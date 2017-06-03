package Ex08;

public class Frog extends AquaticAnimal implements EggLayer {

  Frog(String name) {
    super(name);
  }

  @Override
  public void layEggs() {
    System.out.println(getName() + " is laying eggs.");
  }

  @Override
  public void makeSound() {
    System.out.println("Ribbit ribbit");
  }

  @Override
  public void reproduce() {
    layEggs();
  }
}
