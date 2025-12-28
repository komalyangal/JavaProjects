package com.sunbeam;

class Node {
	int val;
	Node left, right;
	public Node(int val) {
		this.val = val;
		this.left = null;
		this.right = null;
	}
}

class Tree {
	Node root;
	public Tree() {
		root = null;
	}
	void add(int v) {
		Node nn = new Node(v);
		if(root == null)
			root = nn;
		else {
			Node trav = root;
			while(true) {
				if(v < trav.val) {
					if(trav.left == null) {
						trav.left = nn;
						break;
					}
					trav = trav.left;
				}
				else {
					if(trav.right == null) {
						trav.right = nn;
						break;
					}
					trav = trav.right;
				}
			}
		}
	}
	void preorder(Node trav) {
		if(trav == null)
			return;
		System.out.print(trav.val + ", ");
		preorder(trav.left);
		preorder(trav.right);
	}
	void inorder(Node trav) {
		if(trav == null)
			return;
		inorder(trav.left);
		System.out.print(trav.val + ", ");
		inorder(trav.right);
	}
	void postorder(Node trav) {
		if(trav == null)
			return;
		postorder(trav.left);
		postorder(trav.right);
		System.out.print(trav.val + ", ");
	}
}

public class TreeMain {
	public static void main(String[] args) {
		System.out.println("Binary Search Tree!!");
		Tree t = new Tree();
		t.add(50);
		t.add(25);
		t.add(75);
		t.add(10);
		t.add(35);
		t.add(60);
		t.add(90);
		t.add(30);
		t.add(40);
		t.preorder(t.root);
		System.out.println();
		t.inorder(t.root);
		System.out.println();
		t.postorder(t.root);
		System.out.println();
	}
}
