package Ex02;

public class launcher {
    private final static int SIZE = 10;

    public static void main(String args[]) {
        if (args.length < 1 || (!args[0].equals("0") && !args[0].equals("1"))) {
            System.out.println("USAGE:  java TextLoop <mode>");
            System.out.println(" mode 0: without threads");
            System.out.println(" mode 1: with threads");
        } else if (args[0].equals("0")) {
            System.out.println("Mode 0 --- without threads");
            for (int i = 0; i < SIZE; i++) {
                Runnable r = new TextLoop("Thread " + i + ".");
                r.run();
            }
        } else {
            System.out.println("Mode 1 --- with threads");
            for (int i = 0; i < SIZE; i++) {
                Runnable r = new TextLoop("Thread " + i + ".");
                Thread t = new Thread(r);
                t.start();
            }
        }
    }
}
