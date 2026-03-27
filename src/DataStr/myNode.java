package DataStr;

public class myNode<Ttype> {
	private Ttype element;
	private myNode NextNode = null;
	private myNode PreviousNode = null;

	public Ttype getElement() {
		return element;
	}

	public void setElement(Ttype element) {
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

	public myNode(Ttype element) {
		if (element!=null) {
			this.element=element;
		}
		else {
			this.element=((Ttype) new Object());
		}
		setElement(element);
	}

	public String toString() {
		return "" + element;
	}

}
