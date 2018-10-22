/**
 * 
 */
package daris_lab;

/**
 * @author Daris Lychuk
 *
 */
public class ListElement {
	
	
	public ListElement next;
	//public ListElement previous;
	private int data;
	
	
	public ListElement()
	{
		this.next = null;
		this.data = 0;
		//this.previous = null;
		
	}
	
	
	public void setData(int data)
	{
		this.data = data;
	}

	
	public int getData()
	{
		return this.data;
	}
	
	public void setNext(ListElement next){
		this.next = next;
	}

	public ListElement getNext(){
		return this.next;
	}
}