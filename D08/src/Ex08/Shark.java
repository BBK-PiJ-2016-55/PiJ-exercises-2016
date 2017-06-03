package Ex08;

public class Shark extends AquaticAnimal implements EggLayer {

  public Shark(String name) {
    super(name);
  }

  @Override
  public void layEggs() {
    System.out.println(getName() + " is laying eggs.");
  }

  @Override
  public void makeSound() {
    System.out.println("Der der der der. Der der der der.");
  }

  @Override
  public void reproduce() {
    layEggs();
  }
}
