package com.alcatel;

//Java program to find Kth node from mid
//of a linked list in single traversal

//Linked list node
class Node {
	int data;
	Node next;

	Node(int d) {
		this.data = d;
		this.next = null;
	}
}

class KNode {
	Node start;

	KNode() {
		start = null;
	}

	// Function to push node at head
	public void push(int data) {
		if(start==null){
			start=new Node(data);
		}else{
			Node Temp=new Node(data);
			Temp.next=start;
			start=Temp;
		}
	}

	// method to get the count of node
	public int getCount(Node start) {
		Node Temp=start;
		int i=0;
		while(Temp!=null){
		
			Temp=Temp.next;
			i++;
		}
		
		return i;
		
	}

	// Function to get the kth node from the mid
	// towards begin of the linked list
	public int printKthfromid(Node start, int k) {
		// Get the count of total number of
		// nodes in the linked list
		  int n = getCount(start);
	        int reqNode = ((n + 1) / 2) - k;
	 
	        // If no such node exists, return -1
	        if(reqNode <= 0)
	            return -1;
	        else
	        {
	            Node current = start;
	            int count = 1,ans = 0;
	            while (current != null)
	            {
	                if (count == reqNode)
	                {
	                    ans = current.data;
	                    break;
	                }
	                count++;
	                current = current.next;
	            }
	            return ans;
	        }
	
	}

	// Driver code
	public static void main(String[] args) {
		// create linked list
		// 1->2->3->4->5->6->7
		KNode ll = new KNode();
		ll.push(335);
		ll.push(468);
		
		System.out.println(ll.printKthfromid(ll.start, 1));
	}
}

// This Code is contributed by Adarsh_Verma
