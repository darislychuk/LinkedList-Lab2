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
		
		
		le.setData(1); //set values to list elements
		le2.setData(2);
		le3.setData(3);
		le4.setData(4);

		
		System.out.print("Values from getData() (no LL): ");//Print elements from ListElement Class
		System.out.print(le.getData() + " ");
		System.out.print(le2.getData() + " ");
		System.out.print(le3.getData() + " ");
		System.out.print(le4.getData() + " ");
		System.out.print("\n\n");

		
		LinkedList list = new LinkedList();//Create Linked list

		
		System.out.print("Adding an elements...\n");//Add elements to List
		list.addElement(le);
		list.addElement(le2);
		list.addElement(le3);
		list.addElement(le4);
		
	
		list.printLinkedListHead();//Print all elements in the list
		System.out.print("\n");

		
	}

}
