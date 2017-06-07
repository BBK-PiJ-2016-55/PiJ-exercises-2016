package Ex01;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraySorter {

  public static void main(String[] args) {

    Integer[] intArray = {1, 4, 5, 6, 7, 9};
    System.out.println(Arrays.asList(intArray));
    System.out.println("");

    String[] strArray = {"one", "two", "three", "four", "five"};

    // length (i.e., shortest to longest)
    // without lambdas

    Arrays.sort(strArray, new Comparator<String>() {
      @Override
      public int compare(String s1, String s2) {
        return s1.length() - s2.length();
      }
    });

    System.out.println("Sorted on length (shortest first) without lambdas: ");
    System.out.println(Arrays.asList(strArray));
    System.out.println("");

    // with lambdas
    Arrays.sort(strArray, (s1, s2) -> s1.length() - s2.length());
    System.out.println("Sorted on length (shortest first) with lambdas: ");
    System.out.println(Arrays.asList(strArray));
    System.out.println("");

    // reverse length (i.e., longest to shortest)
    Arrays.sort(strArray, (s1, s2) -> s2.length() - s1.length());
    System.out.println("Sorted on length (longest first) with lambdas: ");
    System.out.println(Arrays.asList(strArray));
    System.out.println("");

    // first character
    Arrays.sort(strArray, (s1, s2) -> s1.substring(0,1).compareTo(s2.substring(0,1)) );
    System.out.println("Sorted on first character with lambdas: ");
    System.out.println(Arrays.asList(strArray));
    System.out.println("");

    //Strings that contain “e” first, everything else second
    Arrays.sort(strArray, (s1, s2) -> {
      if (s1.contains("e") && s2.contains("e")) {
        return 0;
      } else if (s1.contains("e")) {
        return -1;
      } else {
        return 1;
      }
    });
    System.out.println("Sorted with contains 'e' first using block lambda: ");
    System.out.println(Arrays.asList(strArray));
    System.out.println("");


  }


}
