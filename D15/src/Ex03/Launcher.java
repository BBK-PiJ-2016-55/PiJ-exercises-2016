package Ex03;

/**
 * Created by svince04 on 21/04/2017 for PiJ-exercises-2016.
 */
public class Launcher {
    public static void main(String[] args) {
        Hailstone myHail = new Hailstone();
        myHail.hail(7);
        System.out.println("Result: " + myHail.result);

    }
}