package corecavaseven;

public class LinkedListWithoutCollectionFrameWork {
	Node head;
	private int size;
	public LinkedListWithoutCollectionFrameWork() {
		this.size = 0;
	}
	public class Node
	{
		String data;
		Node next;
		Node(String data)
		{
			this.data = data;
			this.next = null;
			size++;
		}
	}
	
	public void addFirst(String data)
	{
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	public void addLast(String data)
	{
		Node newNode = new Node(data);
		if(head == null)
		{
			head = newNode;
			return;
		}
		Node lastNode = head;
		while(lastNode.next != null)
		{
			lastNode = lastNode.next;
		}
		lastNode.next = newNode;
	}
	public void printList()
	{
		Node currNode = head;
		while (currNode != null) 
		{
			System.out.print(currNode.data+" -> " );
			currNode = currNode.next;
		}
		System.out.println("null");
	}
	public void removeFirst()
	{
		if(head == null)
		{
			System.out.println("Empty List, nothing to delete");
			return;
		}
		head = this.head.next;
		size--;
	}
	public void removeLast()
	{
		if(head == null)
		{
			System.out.println("Empty List, noting to delete");
			return;
		}
		size--;
		if(head.next == null)
		{
			head = null;
			return;
		}
		Node currNode = head;
		Node lastNode = head.next;
		while(lastNode.next != null)
		{
			currNode = currNode.next;
			lastNode = lastNode.next;
		}
		currNode.next = null;
	}
	public int getSize()
	{
		return size;
	}
	public static void main(String[] args) {
		LinkedListWithoutCollectionFrameWork linkedListObj = new LinkedListWithoutCollectionFrameWork();
		linkedListObj.addFirst("Shivam");
		linkedListObj.addFirst("is");
		linkedListObj.addFirst("name");
		linkedListObj.addFirst("My");
		linkedListObj.printList();
		
		linkedListObj.addLast("Thakur");
		linkedListObj.printList();
		
		System.out.println(linkedListObj.getSize());
		linkedListObj.removeLast();
		linkedListObj.printList();
		System.out.println(linkedListObj.getSize());
		linkedListObj.removeFirst();
		linkedListObj.printList();
		System.out.println(linkedListObj.getSize());

	}

}
