package DataStr;

public class myNode {
	private char element;
	private myNode NextNode = null;
	private myNode PreviousNode = null;

	public char getElement() {
		return element;
	}

	public void setElement(char element) {
		this.element = element;
	}

	public myNode getNextNode() {
		return NextNode;
	}

	public void setNextNode(myNode nextNode) {
		NextNode = nextNode;
	}

	public myNode getPreviousNode() {
		return PreviousNode;
	}

	public void setPreviousNode(myNode previousNode) {
		PreviousNode = previousNode;
	}

	public myNode(char element) {
		setElement(element);
	}

	public String toString() {
		return "" + element;
	}

}
