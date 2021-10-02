package com.alcatel;

public class ReverseLinkedList {

    static Node head;
	static Node sorted;

	static class Node {
		int val;
		Node next;

		public Node(int val) {
			this.val = val;
		}
	}

	public static void push(int value) {
		if (head == null) {
			head = new Node(value);
			head.next = null;
		} else {
			Node temp = head;
			head = new Node(value);
			head.next = temp;
		}
	}
	
	public static void display(){
		Node current=head;
		Node prev,next;
		prev=next=null;
		
		while(current!=null){
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
	}

	public static void main(String args[]) {
		ReverseLinkedList.push(10);
		ReverseLinkedList.push(16);
		ReverseLinkedList.display();
		

	}

}
