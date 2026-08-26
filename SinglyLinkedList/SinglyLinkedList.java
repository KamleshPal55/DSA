package SinglyLinkedList;

public class SinglyLinkedList {
	private ListNode head;

	private static class ListNode{
		private int data;  //Generic Type
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	//Print the Singly Linked List
	public void display(){
		ListNode current = head;
		while(current != null) {
			System.out.print(current.data + " -->");
			current = current.next;
		}
		System.out.println("null");
	}

	//Find the length of single Linked List
	public int getLength() {
		if(head == null) {
			return 0;
		}
		int count = 0;
		ListNode current = head;
		while(current != null) {
			count++;
			current = current.next;
		}
		return count;
	}
	//Insert node at the beginning of Singly Linked List
	public void insertFirst(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
	}

	//Insert node at the end of Singly Linked List
	public void insertLast(int value) {
		ListNode newNode = new ListNode(value);
		if(head == null) {
			head = newNode;
			return;
		}
		ListNode current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}

	//Insert node at the given position of Singly Linked List
	//Assuming given position is a valid position and not crossing the boundaries of singly linked list.
	public void insertAt(int position, int value) {
		//1 -> 4 -> 5
		//1 -> 6 -> 4 -> 5
		ListNode newNode = new ListNode(value);
		if(position ==1) {
			newNode.next = head;
			head = newNode;
		} else {
			ListNode previous = head;
			int count = 1; //position -1
			while(count < position -1) {
				previous.next = previous;
				count++;
			}
			ListNode current = previous.next;
			previous.next = newNode;
			newNode.next = current;
		}
	}


	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
//		sll.head = new ListNode(10); // head is assigned the newly created list node
//		ListNode second = new ListNode(1);
//		ListNode third = new ListNode(8);
//		ListNode fourth = new ListNode(11);
//
//		//Now we'll connect them together to form a chain
//		sll.head.next = second;  //10 --> 1
//		second.next = third; // 10 --> 1 --> 8
//		third.next = fourth; // 10 --> 1 --> 8 --> 11 --> null
//
//		sll.insertFirst(30);
//		sll.insertFirst(40);
//		sll.insertFirst(50);
//
//		sll.insertLast(77);
//		sll.insertLast(88);
//		sll.insertLast(99);

		sll.insertAt(1, 3);
		sll.insertAt(2, 5);
		sll.insertAt(1, 2);
		sll.insertAt(2, 4);
		sll.insertAt(5, 7);

		sll.display();
		System.out.println("Length is - " + sll.getLength());


	}
}
