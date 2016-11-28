/**
* An element has a value and pointer to the next element in the list.
*/

public class Element {
	private int value;
	private Element nextElement = null;
		
	public Element(int value) {
		this.value = value;
		this.nextElement = null;
	}  
	
	public void setNextElement(Element nextElement) {
		this.nextElement = nextElement;
	}
	
	public Element getNextElement() {
		return this.nextElement;
	}
	
	public void printValue() {
		System.out.println(this.value);
	}
	
}