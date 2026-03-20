package DataStr;

public class MyLinkedList {
private myNode firstNode=null;
private myNode lastNode=null;
private int howManyElements=0;

public int getHowManyElements() {
	return howManyElements;
}
public boolean isEmpty() {
	return (howManyElements==0);
}
public boolean isFUll() {
	try{
	myNode newNode =new myNode('a');
	return false;
	}
	catch(OutOfMemoryError error)  {
	return true;
	}
}

}
