package mainService;

import DataStr.MyLinkedList;

public class MainService {

	public static void main(String[] args) {
		MyLinkedList symbols = new MyLinkedList();
		try {
			symbols.add('A');
			symbols.add('B');
			symbols.add('C');
			symbols.print();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());

		}
	}

}
