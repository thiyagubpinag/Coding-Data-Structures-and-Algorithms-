package com.archieves;

public class LinkedList {

	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList list = new LinkedList();
		list.head = new Node(85);
		list.head.next = new Node(15);
		list.head.next.next = new Node(4);
		list.head.next.next.next = new Node(20);

		System.out.println("Given Linked list");
		list.printList(head);
		head = list.reverse(head);
		System.out.println("");
		System.out.println("Reversed linked list ");
		list.printList(head);

	}

	private Node reverse(Node head2) {
		// TODO Auto-generated method stub
		Node prev = null;
		Node next = null;
		Node current = head2;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head2=prev;
		return head2;

	}

	private void printList(Node head2) {
		// TODO Auto-generated method stub
		Node temp = head2;
		while (temp.next != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

		System.out.println(temp.data);

	}

}
