package com.archieves;

public class MergeLists {

	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void addToTheLast(Node node) {
		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null)
				temp = temp.next;
			temp.next = node;
		}
	}

	void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MergeLists llist1 = new MergeLists();
		MergeLists llist2 = new MergeLists();

		// Node head1 = new Node(5);
		llist1.addToTheLast(new Node(5));
		llist1.addToTheLast(new Node(10));
		llist1.addToTheLast(new Node(15));

		// Node head2 = new Node(2);
		llist2.addToTheLast(new Node(2));
		llist2.addToTheLast(new Node(3));
		llist2.addToTheLast(new Node(20));

		llist1.head = SortedMerge(llist1.head, llist2.head);
		llist1.printList();

	}

	public static Node SortedMerge(Node A, Node B) {

		if (A == null)
			return B;
		if (B == null)
			return A;

		if (A.data < B.data) {
			A.next = SortedMerge(A.next, B);
			return A;
		} else {
			B.next = SortedMerge(A, B.next);
			return B;
		}

	}

}
