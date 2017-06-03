package Ex08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * A small program that asks for the names and IDs of all employees in a small
 * company, and stores them in an array of integers and an array of Strings.
 * Reads the names and IDs of employees until the user enters an empty name
 * (i.e. length 0) or an ID equal to 0.
 * Once finished reading employee data, go through the employee list and print
 * the names and IDs of those employees whose ID is even or their names start with “S”.
 */
public class BigEnough {
  private List<String> nameList = new ArrayList<>();
  private List<Integer> idList = new ArrayList<>();
  private boolean finished = false;

  public static void main (String[] args) {
    BigEnough be = new BigEnough();
    be.enterData();
  }

  private void enterData() {

    while (!finished) {
      System.out.println("Enter employee name: ");
      Scanner scanner = new Scanner(System.in);
      String name = scanner.nextLine();

      System.out.println("Enter employee ID: ");
      int id = scanner.nextInt();

      addToLists(name, id);
    }

    printNames();
  }


  private void addToLists(String name, int id) {
    // Checks names for stop value
    if (name.equals("") || name.equals(" ") || id == 0) {
      finished = true;
      return;
    }
    nameList.add(name);
    idList.add(id);
  }

  private void printNames() {
    int size = nameList.size();

   for (int i = 0; i < size; i++) {
     if (nameList.get(i).startsWith("S")) {
       System.out.println("Name: " + nameList.get(i) + ", ID: " + idList.get(i));

       nameList.remove(i);
       idList.remove(i);
       size = nameList.size();
     }
   }

   for (int i = 0; i < size; i++) {
     if (idList.get(i) % 2 == 0) {
       System.out.println("Name: " + nameList.get(i) + ", ID: " + idList.get(i));
     }
   }

  }

}
