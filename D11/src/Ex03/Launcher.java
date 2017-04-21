package Ex03;

public class Launcher {
    public static void main(String[] args){
        Launcher launcher = new Launcher();
        launcher.launch();
    }

    public void launch() {
        IntegerTreeNode itn = new IntegerTreeNode(5);
        itn.add(3);
        itn.add(76);
        itn.add(1);
        itn.add(8);
        itn.add(17);
        System.out.println(itn.contains(3));
        System.out.println(itn.contains(76));
        System.out.println(itn.contains(2));
        System.out.println(itn.getMax());
        System.out.println(itn.getMin());
        System.out.println(itn.toString());
    }
}
