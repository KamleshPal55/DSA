package SinglyLinkedList;

public class ReverseASinglyLinkedList extends SinglyLinkedList{
	public static ListNode reverseList() {
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;
		while(current != null) {
			next = current.next;
			current.next = previous;
			previous= current;
			current = next;
		}
		return previous;
	}
}
