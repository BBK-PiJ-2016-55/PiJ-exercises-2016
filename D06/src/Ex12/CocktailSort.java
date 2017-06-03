package Ex12;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Cocktail sort is a combination of two bubble sorts. First the list is traversed
 * in one direction to move the highest element to the end, and then it is
 * traversed in the opposite direction to move the lowest element to the beginning.
 * This bidirectional process is repeated until there are no swaps in the list,
 * which shows that the list is sorted.
 */
public class CocktailSort implements Comparator<Integer>{
  private static List<Integer> unsortedList = new LinkedList<>();
  private static boolean sorted = false;

  public static void main(String[] args) {

    for (int c = 1; c < 100; c++) {
      unsortedList.add((int) (Math.random() * 100 + 1));
    }

    long startTime = System.currentTimeMillis();
    while (!sorted) {
      bubbleSort(unsortedList);
      reverseBubbleSort(unsortedList);
    }
    long runTime = System.currentTimeMillis() - startTime;
    System.out.println("Runtime: " + runTime + " milliseconds");

    System.out.print("Sorted list: ");
    for (Integer i : unsortedList) {
      System.out.print(i + " ");
    }

  }

  private static void bubbleSort(List<Integer> tempUnsortedList) {

    sorted = true;

    for (int i = 0; i < (tempUnsortedList.size() - 1) ; i++) {

      int firstValue = tempUnsortedList.get(i);

        if (tempUnsortedList.get(i) > tempUnsortedList.get(i + 1)) {
          sorted = false;
          tempUnsortedList.set(i, tempUnsortedList.get(i + 1));
          tempUnsortedList.set(i + 1, firstValue);

        }
      }

    unsortedList = tempUnsortedList;
  }

  private static void reverseBubbleSort(List<Integer> tempUnsortedList) {

    sorted = true;

    for (int i = tempUnsortedList.size() - 1; i > 1 ; i--) {

      int firstValue = tempUnsortedList.get(i);

      if (tempUnsortedList.get(i) < tempUnsortedList.get(i - 1)) {
        sorted = false;
        tempUnsortedList.set(i, tempUnsortedList.get(i - 1));
        tempUnsortedList.set(i - 1, firstValue);
      }
    }
    unsortedList = tempUnsortedList;
  }

  @Override
  public int compare(Integer firstNumber, Integer secondNumber) {
    if (firstNumber > secondNumber) {
      return 1;
    } else if (firstNumber < secondNumber) {
      return -1;
    } else {
      return 0;
    }
  }

}
