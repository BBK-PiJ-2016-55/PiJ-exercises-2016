package Ex08;

public abstract class LandAnimal implements Animal{

  private String name;

  LandAnimal(String name) {
    this.name = name;
  }

  public void call() {
    System.out.println(name + " coming...");
  }

  public abstract void makeSound();

  public abstract void reproduce();

  public String getName() {
    return name;
  }
}
