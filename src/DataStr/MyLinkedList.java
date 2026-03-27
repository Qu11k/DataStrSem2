package DataStr;

public class MyLinkedList<Ttype> {
private myNode firstNode=null;
private myNode lastNode=null;
private int howManyElements=0;

public int getHowManyElements() {
	return howManyElements;
}
public boolean isEmpty() {
	return (howManyElements==0);
}
public boolean isFull() {
	try{
	myNode newNode = new myNode('a');
	return false;
	}
	catch(OutOfMemoryError error)  {
	return true;
	}
}
public void add(Ttype element, int position) throws Exception {
	if (position < 0){
		throw new Exception("pozicija nevar but mazaka par 0");
	}
	if(element == null) {
		throw new Exception("Ievades elements nevar but null");
	}
	if (position > howManyElements){
		throw new Exception("pozicija nevar but lielaka ka atlautais");
	}
	if (position == 0){
		myNode newNode= new myNode(element);
		firstNode.setPreviousNode(newNode);
		newNode.setNextNode(firstNode);
		firstNode=newNode;
		howManyElements++;
	}
	else if (position == howManyElements) {
		add(element);
	}
	
	else {
		myNode currentNode=firstNode;//TODO noskaidrot kura pozicija tuvak sakumam vai beigam ir jaievieto bloks
		for(int i = 1;i<position;i++) {
			currentNode = currentNode.getNextNode();
		}
		myNode previousNode = currentNode;
		myNode nextNode=currentNode.getNextNode();
		
		myNode newNode=new myNode(element);
		
		newNode.setPreviousNode(previousNode);
		previousNode.setNextNode(newNode);
		newNode.setNextNode(nextNode);
		nextNode.setPreviousNode(newNode);
		howManyElements++;
	}}
	public void add(Ttype element) throws Exception {
	if(isFull()) {
		throw  new Exception("saraksts ir pilns nevar pievienot elementu");
}
	if(element == null) {
		throw new Exception("Ievades elements nevar but null");
	}
if(howManyElements==0) {
	myNode newNode=new myNode(element);
	firstNode=newNode;
	lastNode=newNode;
	howManyElements++;
}
else {
	myNode newNode=new myNode(element);
	newNode.setPreviousNode(lastNode);
	lastNode.setNextNode(newNode);
	lastNode=newNode;
	howManyElements++;
}
	}
public void print() throws Exception{
	if (isEmpty()) {
		throw (new Exception("saraksts tuks"));
	}
	myNode currentNode=firstNode;
	while (currentNode!=null) {
		System.out.print(currentNode.getElement()+" ");
		currentNode=currentNode.getNextNode();
	}

	System.out.println();
}
public void remove(int position) throws Exception {
	if (isEmpty()) {
		throw (new Exception("saraksts tuks"));
	}
	if (position < 0){
		throw new Exception("pozicija nevar but mazaka par 0");
	}
	if (position >= howManyElements){
		throw new Exception("pozicija nevar but lielaka ka atlautais");}
	if (position==0) {
		myNode newFirstNode = firstNode.getNextNode();
		newFirstNode.setPreviousNode(null);
		firstNode=newFirstNode;
		howManyElements--;
	}
	else if (position==howManyElements-1) {
		myNode newLastNode=lastNode.getPreviousNode();
		newLastNode.setNextNode(null);
		lastNode=newLastNode;
		howManyElements--;
		
	}
	else {
		myNode currentNode=firstNode;
		for(int i = 1; i < position;i++) {
			currentNode=currentNode.getNextNode();
		}
		myNode newLeftNode=currentNode;
		myNode newRightNode=currentNode.getNextNode().getNextNode();
		
		newLeftNode.setNextNode(newRightNode);
		newRightNode.setPreviousNode(newLeftNode);
		
		howManyElements--;
	}
}

public Ttype get(int position) throws Exception {
	if (isEmpty()) {
		throw (new Exception("saraksts tuks"));
	}
	if (position < 0){
		throw new Exception("pozicija nevar but mazaka par 0");
	}
	if (position >= howManyElements){
		throw new Exception("pozicija nevar but lielaka ka atlautais");
		}
	 myNode currentNode = firstNode;
	    for (int i = 1; i <= position; i++) {
	        currentNode = currentNode.getNextNode();
	    }
	    return (Ttype)currentNode.getElement();
}
public int search(Ttype element) throws Exception {
	if (isEmpty()) {
		throw (new Exception("saraksts tuks"));}
	
	if(element == null) {
		throw new Exception("Ievades elements nevar but null");
	}
	int foundPosition=0;
	myNode currentNode=firstNode;
	while(currentNode!=null) {
		if(currentNode.getElement().equals(element)) {
			return foundPosition;
		}
		foundPosition++;
		currentNode=currentNode.getNextNode();
	}
	throw new Exception("mekletais elements saraksta neeksiste");
	
}
public void makeEmpty() {
	firstNode=null;
	lastNode=null;
	howManyElements=0;
	System.gc();
}
}