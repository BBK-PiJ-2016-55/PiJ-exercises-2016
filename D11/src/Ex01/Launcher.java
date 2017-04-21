package Ex01;

public class Launcher {
    public static void main(String[] args){
        Launcher launcher = new Launcher();
        launcher.launch();
    }

    public void launch() {
        IntegerTreeNode itn = new IntegerTreeNode(5);
        itn.add(7);
        itn.add(2);
        itn.add(4);
        itn.add(77);
        System.out.println(itn.contains(5));
        System.out.println(itn.contains(7));
        System.out.println(itn.contains(2));
        System.out.println(itn.getMax());
        System.out.println(itn.getMin());
    }
}
