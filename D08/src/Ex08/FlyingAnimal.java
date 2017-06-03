package Ex08;

public abstract class FlyingAnimal implements Animal {

  private String name;

  FlyingAnimal(String name) {
    this.name = name;
  }

  public void call() {
    System.out.println(name + " now flying, will come later when tired...");
  }

  public abstract void makeSound();

  public abstract void reproduce();

  public String getName() {
    return name;
  }


}
