//Written by Mia Dia

public class GenLL <T>
{


	private class ListNode
	{
		T data;
		ListNode nextLink, prevLink;
	
		public ListNode(T aData, ListNode aNext, ListNode aPrev) 
		{
			data = aData;
			nextLink = aNext;
			prevLink = aPrev;
		}
	}

	private ListNode head;
	private ListNode current;
	public GenLL() 
	{
		head = current = null;
	}

//Methods / / / / / / / / / / / / / / /
	
	public void add(T aData) {
		ListNode newNode = new ListNode(aData,null,null);
		if(head == null) {
			head = newNode;
			current = head;
			return;
		}
		ListNode temp = head;
		while(temp.nextLink !=null)
		{
			temp = temp.nextLink;
		}
		temp.nextLink = newNode;
		newNode.prevLink = temp;
	}
	
	
	public void gotoNext() {
		if(current == null) {
			return;
		}
		current = current.nextLink;
	}

	public void gotoPrev() {
		if(current == null) {
			return;
		}
		current = current.prevLink;
	}

	public boolean hasMore() {
		return current != null;
	}

	public void reset() {
		current = head;
	}

	
// Gets and Sets / / / / / / / / / / /
	public T getCurrent() {
		if(current == null) {
			return null;
		}
		return current.data;
	}

	public void setCurrent(T aData) {
		if(aData == null || current == null){
			return;}
		if(current != null) {
			current.data = aData;
		}	
	}
// / / / / / / / / / / / / / / / / / /
	

	public void addAfterCurrent(T aData)
	{
		if(current == null)
		{
			return;
		}
		ListNode newNode = new ListNode(aData,current.nextLink,current);
		if(current.nextLink != null)
		{
			current.nextLink.prevLink = newNode;
		}
		current.nextLink = newNode;
	}

	public void removeCurrent()
	{
		if(current == null) {
			return;
		}
		if(current == head)
		{
			head = head.nextLink;
			if(head != null) 
			{
				head.prevLink = null;
			}
			current = head;
			return;
		}
		
		current.prevLink.nextLink = current.nextLink;
		
		if(current.nextLink != null)
		{
			current.nextLink.prevLink = current.prevLink;
		}
		current = current.nextLink;
	}	

	public void print() {
		ListNode temp = head;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.nextLink;
		}
	}
	public void deleteTitle(T aData)
	{
		reset();
		
		for(ListNode temp = head; temp != null; temp = temp.nextLink) {
			if(temp.data.equals(aData))
			{
				removeCurrent();
			}
			gotoNext();
		}	
	}
	
	public boolean contains(T aData)
	{
		for(ListNode temp = head; temp != null; temp = temp.nextLink) {
			if(temp.data.equals(aData))
			{
				return true;
			}
		}	
		return false;
	}
	
}
