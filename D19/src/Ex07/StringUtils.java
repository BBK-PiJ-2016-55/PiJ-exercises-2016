package Ex07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Create a static method called transformedList. It should take a List of Strings
 * and a Function<String,String> and return a new List that contains the results of
 * applying the function to each element of the original list. For example:
 *
 *  List<String> excitingWords = StringUtils.transformedList(words, s -> s + "!");
 *
 *  List<String> eyeWords = StringUtils.transformedList(words, s -> s.replace("i", "eye"));
 *
 *  List<String> upperCaseWords = StringUtils.transformedList(words, String::toUpperCase);
 *
 */
public class StringUtils {

  public static void main(String[] args) {

    List<String> inList = new ArrayList<>(Arrays.asList("one", "Marvellous", "twice", "three", "twelbe", "nurteen"));

    List<String> excitingWords = StringUtils.transformedList(inList, s -> s + "!");
    System.out.println(excitingWords);
    System.out.println("");

    List<String> eyeWords = StringUtils.transformedList(inList, s -> s.replace("i", "eye"));
    System.out.println(eyeWords);
    System.out.println("");

    List<String> upperCaseWords = StringUtils.transformedList(inList, s -> s.toUpperCase());
    System.out.println(upperCaseWords);
    System.out.println("");

  }

  public static List<String> transformedList(List<String> words, Function<String, String> fun) {

    List<String> resultList = new ArrayList<>();

    for (String s : words) {
      resultList.add(fun.apply(s));
    }

    return resultList;
  }

}
