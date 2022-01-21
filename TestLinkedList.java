
public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		 
		// add more elements to LinkedList
		myList.add("1");
		myList.add("2");
		myList.add("3");
		myList.add("4");
		myList.add("5");
 
		
		LinkedList<Integer> mySecondList = new LinkedList<Integer>();
		mySecondList.add(1);
		mySecondList.add(2);
		mySecondList.add(3);
		mySecondList.add(5);
		mySecondList.add(4);
		mySecondList.add(5);
		
		/*
		 * Please note that primitive values can not be added into LinkedList directly. 
		 * They must be converted to their
		 * corresponding wrapper class.
		 */
 
		
		System.out.println("Print: myList: " + myList);
		System.out.println(".getLength(): " + myList.getLength());
		System.out.println(".getLength(): " + myList.getLength());
		myList.insertNth(3, "100");
		System.out.println(".getLength(): " + myList.getLength());
		System.out.println(".insertNth(): " + myList);
		System.out.println();
		System.out.println("Print: myList: " + mySecondList);
		System.out.println(".getLength(): " + mySecondList.getLength());
		System.out.println(".getLength(): " + mySecondList.getLength());
		mySecondList.insertNth(3, 100);
		System.out.println(".getLength(): " + mySecondList.getLength());
		System.out.println(".insertNth(): " + mySecondList);
		

	}

}
