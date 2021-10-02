package com.alcatel;

//Java program to partition a
//linked list around a given value.
class PartitionSortedList {

	/* Link list Node */
	static class Node {
		int data;
		Node next;
	}

	// A utility function to create a new node
	static Node newNode(int data) {
		Node new_node = new Node();
		new_node.data = data;
		new_node.next = null;
		return new_node;
	}

	// Function to make two separate lists and return
	// head after concatenating
	static Node partition(Node head, int x) {
		Node lessHead, lessLast, greaterHead, greaterLast;
		lessHead = lessLast = greaterHead = greaterLast = null;

		while (head != null) {
			if (head.data >= x) {
				if (greaterHead == null) {
					greaterHead = greaterLast = head;
				} else {
					greaterLast.next = head;
					greaterLast = greaterLast.next;
				}
			} else if (head.data < x) {
				if (lessHead == null) {
					lessHead = lessLast = head;
				} else {
					lessLast.next = head;
					lessLast = lessLast.next;
				}
			}

			head = head.next;

		}

		if (greaterLast != null)
			greaterLast.next = null;

		// Connect three lists

		// If smaller list is empty
		if (lessHead == null) {
			return greaterHead;
		}

		if (greaterHead == null) {
			return lessHead;
		}

		lessLast.next = greaterHead;
		return lessHead;

	}

	/* Function to print linked list */
	static void printList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	// Driver code
	public static void main(String[] args) {
		/* Start with the empty list */
/*		Node head = newNode(10);
		head.next = newNode(4);
		head.next.next = newNode(5);
		head.next.next.next = newNode(30);
		head.next.next.next.next = newNode(2);
		head.next.next.next.next.next = newNode(50);*/
		
		Node head = newNode(1);

		int x = 1;
		head = partition(head, x);
		printList(head);
	}
}

// This code is contributed by Prerna saini.
