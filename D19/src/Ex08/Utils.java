package Ex08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Rewrite transformedList so it works with generic types. Verify that
 * your examples from the previous question still work.
 *
 */
public class Utils {

  public static void main(String[] args) {

    List<String> inList = new ArrayList<>(Arrays.asList("one", "Marvellous", "twice", "three", "twelbe", "nurteen"));
    List<Integer> intList = new ArrayList<>(Arrays.asList(1, 4, 6, 7, 3, 2, 5, 6, 7, 87, 23, 100));

    List<String> excitingWords = Utils.transformedList(inList, s -> s + "!");
    System.out.println(excitingWords);
    System.out.println("");

    List<String> eyeWords = Utils.transformedList(inList, s -> s.replace("i", "eye"));
    System.out.println(eyeWords);
    System.out.println("");

    List<String> upperCaseWords = Utils.transformedList(inList, String::toUpperCase);
    System.out.println(upperCaseWords);
    System.out.println("");

    List<Integer> reversedBits = Utils.transformedList(intList, Integer::reverse);
    System.out.println(reversedBits);
    System.out.println("");

  }

  public static <T> List<T> transformedList(List<T> words, Function<T, T> fun) {

    List<T> resultList = new ArrayList<>();

    for (T s : words) {
      resultList.add(fun.apply(s));
    }

    return resultList;
  }

}
