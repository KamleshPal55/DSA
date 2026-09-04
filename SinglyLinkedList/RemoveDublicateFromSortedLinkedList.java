package SinglyLinkedList;

public class RemoveDublicateFromSortedLinkedList extends SinglyLinkedList {
	public static void removeDuplicates() {
		if(head == null) {
			return;
		}
		ListNode current = head;
		while(current != null && current.next != null) {
			if(current.data == current.next.data) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}
	}
}
