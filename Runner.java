package www.bridgelabz.BST;

public class Runner {
	
	public static void main(String[] args) {

		BinarySearchTree bt = new BinarySearchTree();
		bt.insert(56);
		bt.insert(30);
		bt.insert(70);

		System.out.println("Binary search tree after insertion:");
		// Displays the binary tree
		bt.Display(bt.root);
	}


}
