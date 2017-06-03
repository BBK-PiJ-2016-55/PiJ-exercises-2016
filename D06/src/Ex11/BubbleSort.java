package Ex11;

import java.util.LinkedList;
import java.util.List;

/**
 * Algorithm to sort a linked list of integers.
 *
 * 1. Take the first element. Compare it with the second element. If it is greater, make them change positions (first becomes second and viceversa); otherwise, do nothing.
 * 2. Move to the next element. Repeat the process (i.e. compare 2 and 3, then 3 and 4, up to the last element).
 * 3. Now you have the highest element at the end of the list.
 * 4. Move back to the beginning and repeat the whole process until your list is sorted.
 * 5. Once you pass through the list without swapping elements, your list is sorted.
 */
public class BubbleSort {
  private static List<Integer> unsortedList = new LinkedList<>();
  // private static List<Integer> sortedList = new LinkedList<>();

  public static void main(String[] args) {
    unsortedList.add(5);
    unsortedList.add(32);
    unsortedList.add(1);
    unsortedList.add(54);
    unsortedList.add(3);
    unsortedList.add(17);
    unsortedList.add(55);
    unsortedList.add(3);
    unsortedList.add(2);
    unsortedList.add(99);

    List<Integer> sortedList = bubbleSort(unsortedList);

    for (Integer i : sortedList) {
      System.out.println(i);
    }

  }

  private static List<Integer> bubbleSort(List<Integer> unsortedList) {
    boolean sorted = false;

    while (!sorted) {

      sorted = true;

      for (int i = 0; i < (unsortedList.size() - 1) ; i++) {

        int firstValue = unsortedList.get(i);

        if (unsortedList.get(i) > unsortedList.get(i + 1)) {
          unsortedList.set(i, unsortedList.get(i + 1));
          unsortedList.set(i + 1, firstValue);
          sorted = false;
        }
      }

    }
    return unsortedList;
  }

}
