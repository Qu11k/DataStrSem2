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
			symbols.add('M',0);
			symbols.print();
			symbols.add('L',4);
			symbols.print();
			symbols.add('Z',2);
			symbols.print();
			symbols.remove(0);
			symbols.print();
			symbols.remove(1);
			symbols.print();
			symbols.remove(3);
			symbols.print();
			System.out.println(symbols.get(2));
			System.out.println(symbols.search('B'));
//			System.out.println(symbols.search('m'));
			symbols.makeEmpty();
			symbols.add('Q');
			symbols.print();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());

		}
	}

}
