/**
 * 
 */
package daris_lab;

/**
 * @author Daris Lychuk
 *
 */

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		ListElement le = new ListElement(); //create elements for linked list
		ListElement le2 = new ListElement();
		ListElement le3 = new ListElement();
		ListElement le4 = new ListElement();
		ListElement le5 = new ListElement();
		
		
		le.setData(5); //set values to list elements
		le2.setData(4);
		le3.setData(3);
		le4.setData(2);
		le5.setData(1);
		
		System.out.print("Values from getData() (no LL): ");//Print elements from ListElement Class
		System.out.print(le.getData() + " ");
		System.out.print(le2.getData() + " ");
		System.out.print(le3.getData() + " ");
		System.out.print(le4.getData() + " ");
		System.out.print(le5.getData() + " ");
		System.out.print("\n\n");

		
		LinkedList list = new LinkedList();//Create Linked list

		
		System.out.print("Adding an elements...\n");//Add elements to List
		list.addElement(le);
		list.addElement(le2);
		list.addElement(le3);
		list.addElement(le4);
		list.addElement(le5);
		
	
		list.printLinkedListHead();//Print all elements in the list
		
		
		ListElement temp = new ListElement();//Retrieve a specific element 

		System.out.print("Retrieve element 0\n");
		temp = list.getElement(0);
		System.out.print("Element 0 data = " + temp.getData() + "\n\n");

		System.out.print("Retrieve element 2\n");
		temp = list.getElement(2);
		System.out.print("Element 2 data = " + temp.getData() + "\n\n");
		
		
		System.out.print("Deleting elements: \n");//Delete elements from the list
		
		System.out.print("Delete element with data 3: \n");
		list.deleteElement(3);
		list.printLinkedListHead();

		System.out.print("\n");

		
		System.out.print("Delete head: \n");//Delete head
		list.deleteElement(5);
		list.printLinkedListHead();
		
		System.out.print("\n");

		
	}

}
