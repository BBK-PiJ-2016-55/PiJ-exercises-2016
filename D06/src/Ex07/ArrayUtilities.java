package Ex07;

/**
* ArrayUtilities takes an array of integers and returns a linked list of integers in the same order as
* the original array
*/

public class ArrayUtilities {
	
	public static ElementList toList(int[] myArray){
		
		ElementList myList = new ElementList();
		
		for (int i = 0; i < myArray.length; i++) {
			Element myElement = new Element(myArray[i]);
			myList.addElement(myElement);
			myElement.printValue();
			}
		
		return myList;
		}
		

	}
