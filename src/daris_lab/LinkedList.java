/**
 * 
 */
package daris_lab;

/**
 * @author Daris Lychuk
 *
 */
public class LinkedList {

	ListElement head; //declaration
	
	public void addElement(ListElement le){//addElement function
		ListElement temp = head;//set ListElement temp =equal to the head
		if(head == null){
			head = le;
		}
		else
		{
			while(temp.getNext() != null)//while the element in the linked list is not equal to null get the next element
			{
				temp = temp.getNext();
			}

			temp.setNext(le);
		}
	}
	
	public ListElement getElement(int index){//getElement function
		ListElement temp = head;//set temp to equal head
		int count = 0;

		if(temp == null){//if temp equals null, that means there are no elements
			System.out.print("There are no elements available\n");
			return(temp);
		}

		while(count < index && temp != null){//increments position in linked list
			temp = temp.getNext();
			count++;
		}

		return(temp);
	}
	public ListElement deleteElement(int index){//deleteElement function
		ListElement prev = null;
		ListElement curr = head; 
		
		if(head == null){//if head is equal to null, there are no elements in the list
			System.out.print("There are no elements to delete.\n");
			return(head);
		}else{
			if(head.getData() == index){//if the position index equals the position in the linked list, return the next element
				head = head.getNext();
				return(head);
			}

			while(curr != null && curr.getData() != index){
				prev = curr; //previous is equal to current as long as current is not equal to null and not equal to the index
				curr = curr.getNext();//get the next element
			}

			if(curr == null){
				System.out.print("That node does not exist\n");
				return(curr);
			}else{
				prev.setNext(curr.getNext());
			}

			return(prev);
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
		System.out.print("\n");
	}
}