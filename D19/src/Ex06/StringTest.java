package Ex06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Rewrite allMatches so it works on any List and associated Predicate, not
 * just on Strings.
 *
 * Verify that your examples from the previous question still work.
 */
public class StringTest {

  public static void main(String[] args) {

    List<String> inString = new ArrayList<>(Arrays.asList("one", "marvellous", "two", "three", "twelbe", "nurteen"));
    List<Integer> intList = new ArrayList<>(Arrays.asList(1, 4, 6, 7, 3, 2, 5, 6, 7, 87, 23, 100));

    List<String> shortWords = StringTest.allMatches(inString, s -> s.length() < 4);
    System.out.println(shortWords);

    List<String> wordsWithB = StringTest.allMatches(inString, s -> s.contains("b"));
    System.out.println(wordsWithB);

    List<String> evenLengthWords = StringTest.allMatches(inString, s -> (s.length() % 2) == 0);
    System.out.println(evenLengthWords);

    List<Integer> evenInts = StringTest.allMatches(intList, i -> (i % 2) == 0);
    System.out.println(evenInts);
  }


  private static <T> List<T> allMatches(List<T> list, Predicate<T> pred) {

    List<T> returnList = new ArrayList<>();

    for (T obj : list) {
      if (pred.test(obj)) {
        returnList.add(obj);
      }
    }
    return returnList;
  }



}
