package com.alcatel;

//Java program to sort link list
//using insertion sort

public class LinkedlistIS {
	node head;
	node sorted;

	class node {
		int val;
		node next;

		public node(int val) {
			this.val = val;
		}
	}

	void push(int val) {
		/* allocate node */
		node newnode = new node(val);
		/* link the old list off the new node */
		newnode.next = head;
		/* move the head to point to the new node */
		head = newnode;
	}

	void insertionSort(node headref) {
		sorted = null;
		node current = headref;
		while (current != null) {
			node next = current.next;
			sortedInsert(current);
			current = next;
		}
		head = sorted;
	}

	
	void sortedInsert(node newnode) {
		/* Special case for the head end */
		if (sorted == null || sorted.val >= newnode.val) {
			newnode.next = sorted;
			sorted = newnode;
		} else {
			node current = sorted;
			while (current.next != null && current.next.val < newnode.val) {
				current = current.next;
			}
			newnode.next = current.next;
			current.next = newnode;
		}
	}

	void printlist(node head) {
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}

	// Driver program to test above functions
	public static void main(String[] args) {
		LinkedlistIS list = new LinkedlistIS();
		list.push(5);
		list.push(20);
		list.push(4);
		list.push(3);
		list.push(30);
		System.out.println("Linked List before Sorting..");
		list.printlist(list.head);
		list.insertionSort(list.head);
		System.out.println("\nLinkedList After sorting");
		list.printlist(list.head);
	}
}
