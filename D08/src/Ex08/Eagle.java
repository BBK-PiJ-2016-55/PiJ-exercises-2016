package Ex08;

public class Eagle extends FlyingAnimal implements EggLayer {

  Eagle(String name) {
    super(name);
  }

  @Override
  public void layEggs() {
    System.out.println(getName() + " is laying eggs.");
  }

  @Override
  public void makeSound() {
    System.out.println("CAW");
  }

  @Override
  public void reproduce() {
    layEggs();
  }
}
