import java.util.LinkedList;
import java.util.Queue;

class Node {
	int key;
	Node left, right;

	public Node(int item) {
		key = item;
		left = right = null;
	}
}

class BinaryTree {
	Node root;

	BinaryTree() {
		root = null;
	}

	void printPostorder(Node node) {
		if (node == null)
			return;

		printPostorder(node.left);

		printPostorder(node.right);

		System.out.print(node.key + " ");
	}

	/* Given a binary tree, print its nodes in inorder */
	void printInorder(Node node) {
		if (node == null)
			return;

		printInorder(node.left);

		System.out.print(node.key + " ");

		printInorder(node.right);
	}

	void levelOrderTraversal(Node node) {

		if (node == null)
			return;

		Queue<Node> queueNode = new LinkedList();

		queueNode.add(node);

		while (!queueNode.isEmpty()) {

			Node first=queueNode.peek();
			System.out.print(first.key + " ");
			queueNode.poll();
			
			if(first.left!=null)
			{
				queueNode.add(first.left);
			}
			
			if(first.right!=null)
			{
				queueNode.add(first.right);
			}

		}

	}

	/* Given a binary tree, print its nodes in preorder */
	void printPreorder(Node node) {
		if (node == null)
			return;

		System.out.print(node.key + " ");

		printPreorder(node.left);

		printPreorder(node.right);
	}

	// Wrappers over above recursive functions
	void printPostorder() {
		printPostorder(root);
	}

	void printInorder() {
		printInorder(root);
	}

	void printPreorder() {
		printPreorder(root);
	}
	
	public void LCA(int maindata,int a,int b){
		
		
	}

	// Driver method
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(4);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(2);
		tree.root.left.right = new Node(5);

		System.out.println("Preorder traversal of binary tree is ");
		tree.printPreorder();

		System.out.println("\nInorder traversal of binary tree is ");
		tree.printInorder();

		System.out.println("\nPostorder traversal of binary tree is ");
		tree.printPostorder();
		System.out.println();
		
		tree.levelOrderTraversal(tree.root);
		
		
		tree.LCA(tree.root.key, 4, 3);
	}
}
