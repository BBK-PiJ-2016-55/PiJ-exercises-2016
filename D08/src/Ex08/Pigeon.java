package Ex08;

public class Pigeon extends FlyingAnimal implements EggLayer {

  public Pigeon(String name) {
    super(name);
  }

  @Override
  public void layEggs() {
    System.out.println(getName() + " is laying eggs.");
  }

  @Override
  public void makeSound() {
    System.out.println("Cooooooooo");
  }

  @Override
  public void reproduce() {
    layEggs();
  }
}
