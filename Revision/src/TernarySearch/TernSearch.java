package TernarySearch;

/**
 * In binary search, we split the data set in half at each recursive call.  One could
 * imagine an algorithm that split the data set up into three or four sets at each
 * recursive call.
 *
 * You  have  an  array  of ints sorted  in  ascending  order.   Write  a  method  that
 * recursively does a ternary search (splits the data into three sets instead of two) on
 * the array
 */
public class TernSearch {

  public int ternarySearch(int[] intArray, int target) {

    return ternarySearch(intArray, 0 , intArray.length, target);

  }


  public int ternarySearch(int[] intArray, int start, int end, int target) {

    if (end < start) {
      // -1 if value not found
      return -1;
    }

    int firstThird = (end - start + 1) / 3;
    int secondThird = (firstThird * 2) - 1;

    if (intArray[firstThird] == target) {   // if target is at pivot 1, return
      return firstThird;
    } else if (intArray[secondThird] == target) { // if target is at pivot 2, return
      return secondThird;
    } else if (intArray[firstThird] > target) { // target is in first third of array
      return ternarySearch(intArray, 0, firstThird, target);
    } else if (intArray[firstThird] < target && intArray[secondThird] > target) { // target is in middle third
      return ternarySearch(intArray, firstThird,secondThird, target);
    } else { // target is in final third or not there...
      return ternarySearch(intArray, secondThird, end, target);
    }
  }

}


