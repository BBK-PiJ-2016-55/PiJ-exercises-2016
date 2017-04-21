package Ex07;

/**
* ElementList makes a list of elements
* 
*/

public class ElementList {

	private Element firstElement = null;

	public void addElement(Element element) {
		if (firstElement == null) {
			firstElement = element;
			return;
		}
		
		Element current = firstElement;
		while (current.getNextElement() != null) {
			current = current.getNextElement();
		}
		
		current.setNextElement(element);
	}
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
