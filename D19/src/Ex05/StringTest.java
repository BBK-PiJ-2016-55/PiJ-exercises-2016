package Ex05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Create a static method called allMatches. It should take a List of Strings
 * and a Predicate<String>, and return a new List of all the values that passed
 * the test. Test it with several examples. For example:
 *
 *  List<String> shortWords = StringUtils.allMatches(words, s -> s.length() < 4);
 *  List<String> wordsWithB = StringUtils.allMatches(words, s -> s.contains("b"));
 *  List<String> evenLengthWords = StringUtils.allMatches(words, s -> (s.length() % 2) == 0);
 *
 */
public class StringTest {

  public static void main(String[] args) {

    List<String> inString = new ArrayList<>(Arrays.asList("one", "marvellous", "two", "three", "twelbe", "nurteen"));

    List<String> shortWords = StringTest.allMatches(inString, s -> s.length() < 4);
    System.out.println(shortWords);

    List<String> wordsWithB = StringTest.allMatches(inString, s -> s.contains("b"));
    System.out.println(wordsWithB);

    List<String> evenLengthWords = StringTest.allMatches(inString, s -> (s.length() % 2) == 0);
    System.out.println(evenLengthWords);
  }

  private static List<String> allMatches(List<String> list, Predicate<String> pred) {

    List<String> returnString = new ArrayList<>();

    for (String str : list) {
      if (pred.test(str)) {
        returnString.add(str);
      }
    }
    return returnString;
  }



}
