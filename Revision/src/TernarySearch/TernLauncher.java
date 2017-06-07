package TernarySearch;

public class TernLauncher {

  public static void main(String[] args) {

    int[] inArray = {1, 2, 4, 6, 9, 12};

    TernSearch ts = new TernSearch();
    System.out.print(ts.ternarySearch(inArray, 4));
  }

}
