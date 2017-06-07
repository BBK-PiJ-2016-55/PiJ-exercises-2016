package Ex03;


import java.util.function.Predicate;

/**
 * Create a class with a static method called betterString.
 * This method should take two Strings and a lambda as its arguments.
 * This lambda states whether the first of the two strings is better.
 *
 * The method should return the better string; i.e., if the lambda returns
 * true the method should return the first string, otherwise it should
 * return the second string.
 *
 * For the lambda, define an interface called TwoStringPredicate with a
 * method that takes two Strings and returns true if the first is better
 * than the second, false otherwise.
 */
public class BetterString {

  public static void main(String[] args) {

    String better = betterString("Winning!", "Losing", (str1, str2) -> str1.length() > str2.length());

    System.out.println("Longest string, using lambda passed as an expression: ");
    System.out.println(better);

    better = betterString("Very far away...", "A lot closer to A", (str1, str2) ->
        (str1.substring(0,1).compareTo(str2.substring(0,1)) == -1));

    System.out.println("'Better' string is first character nearest A: ");
    System.out.println(better);

  }

  private static String betterString(String s1, String s2, TwoStringPredicate biggerIsBetter) {

    return (biggerIsBetter.testBetter(s1, s2)) ? s1 : s2;

  }

  interface TwoStringPredicate {

    boolean testBetter(String t1, String t2);

  }


}

