package Ex08;

public abstract class AquaticAnimal implements Animal {

  private String name;

  AquaticAnimal(String name) {
    this.name = name;
  }

  public void call() {
    System.out.println(name + " will not come...");
  }

  public abstract void makeSound();

  public abstract void reproduce();

  public String getName() {
    return name;
  }

}
