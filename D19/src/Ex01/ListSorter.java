package Ex01;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {

  public static void main(String[] args) {

    String[] strArray = {"one", "two", "three", "four", "five"};
    List<String> strList = Arrays.asList(strArray);

    // length (i.e., shortest to longest)
    // without lambdas
    Collections.sort(strList, new Comparator<String>() {
      @Override
      public int compare(String s1,String s2) {
        return s1.length() - s2.length();
      }
    });

    System.out.println("Sorted according to length, without lambda: ");
    System.out.println(strList);
    System.out.println("");

    //with lambda
    strList.sort((s1, s2) -> s1.length() - s2.length());
    System.out.println("Sorted according to length, with lambda: ");
    System.out.println(strList);
    System.out.println("");

    // with method reference
    strList.sort(Comparator.comparingInt(String::length));
    System.out.println("Sorted according to length, using method ref: ");
    System.out.println(strList);
    System.out.println("");

  }
}
