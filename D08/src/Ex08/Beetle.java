package Ex08;

public class Beetle extends FlyingAnimal implements EggLayer {

  Beetle(String name) {
    super(name);
  }

  @Override
  public void layEggs() {
    System.out.println(getName() + " is laying eggs.");
  }

  @Override
  public void makeSound() {
    System.out.println("Scrtchctchhhctcttctcchhhhsss");
  }

  @Override
  public void reproduce() {
    layEggs();
  }
}
