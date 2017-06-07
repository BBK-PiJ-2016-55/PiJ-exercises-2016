package Ex04;


/**
 * Use generics to replace betterString with betterEntry and
 * TwoStringPredicate with TwoElementPredicate. Make sure your
 * previous examples still work when you only change betterString to betterElement.
 */
public class BetterEntry {

  public static void main(String[] args) {

    // 'better' string is the longest
    TwoElementPredicate<String> betterElement = (str1, str2) -> str1.length() > str2.length();

    String better = betterEntry("Winning!", "Losing", betterElement);
    System.out.println("Longest string, using lambda passed as an expression: ");
    System.out.println(better);
    System.out.println("");

    // 'better' string has character nearest 'A'
    betterElement = (str1, str2) ->
        (str1.substring(0,1).compareTo(str2.substring(0,1)) == -1);

    better = betterEntry("Very far away..........", "A lot closer to A", betterElement);
    System.out.println("'Better' string is first character nearest A: ");
    System.out.println(better);
    System.out.println("");

    TwoElementPredicate<Integer> betterIntPred = (n1, n2) -> n1 > n2;
    Integer betterInt = betterEntry(567, 5670, betterIntPred);
    System.out.println("'Better' int is largest: ");
    System.out.println(betterInt);
    System.out.println("");

  }

  private static <T> T betterEntry(T s1, T s2, TwoElementPredicate biggerIsBetter) {

    return (biggerIsBetter.testBetter(s1, s2)) ? s1 : s2;

  }

  interface TwoElementPredicate<T> {

    boolean testBetter(T t1, T t2);

  }


}

