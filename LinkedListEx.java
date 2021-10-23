package com.hackerrank;

public class LinkedListEx {

	public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
		// Write your code here

		SinglyLinkedListNode node = new SinglyLinkedListNode(data);
		SinglyLinkedListNode temp = llist;

		if (llist == null) {
			return node;
		}
		int i = 0;
		while (i < position - 1) {
			temp = temp.next;
			i++;
		}
		node.next = temp.next;
		temp.next = node;
		return llist;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
