package Ex08;

public class Fly extends FlyingAnimal implements EggLayer {

  public Fly(String name) {
    super(name);
  }

  @Override
  public void layEggs() {
    System.out.println(getName() + " is laying eggs.");
  }

  @Override
  public void makeSound() {
    System.out.println("Bzzzzzzzzzz");
  }

  @Override
  public void reproduce() {
    layEggs();
  }
}
