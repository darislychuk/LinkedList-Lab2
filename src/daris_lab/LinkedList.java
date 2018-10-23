/**
 * 
 */
package daris_lab;

/**
 * @author Daris Lychuk
 *
 */
public class LinkedList {

	ListElement head; 
	
	public void addElement(ListElement le){
		ListElement temp = head;
		if(head == null){
			head = le;
		}
		else
		{
			while(temp.getNext() != null)
			{
				temp = temp.getNext();
			}

			temp.setNext(le);
		}
	}
	
	public void printLinkedListHead(){
		ListElement temp = head;

		if(temp == null){
			System.out.print("The list is currently empty.\n");
		}else if(temp.getNext() == null){
			System.out.print(temp.getData() + " ");
		}else{
			do{
				System.out.print(temp.getData() + " ");
				temp = temp.getNext();
			}while(temp != null);

		}
	}
}
