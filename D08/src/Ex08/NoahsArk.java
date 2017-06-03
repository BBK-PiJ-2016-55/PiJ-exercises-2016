package Ex08;

public class NoahsArk {

  public static void main(String[] args) {
    Cat cat = new Cat("Salem");
    cat.call();
    cat.reproduce();
    Frog frog = new Frog("Kermit");
    frog.call();
    frog.reproduce();
    Whale whale = new Whale("Willy");
    whale.call();
    whale.reproduce();
    Salmon salmon = new Salmon("Wanda");
    salmon.call();
    salmon.reproduce();
    Eagle eagle = new Eagle("Eddie");
    eagle.call();
    eagle.reproduce();
    Beetle beetle = new Beetle("John");
    beetle.call();
    beetle.reproduce();
    System.out.println();
  }
}
