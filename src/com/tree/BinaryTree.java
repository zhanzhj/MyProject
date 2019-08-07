package com.tree;

public class BinaryTree {

	public static class Node {
		private int data;
		private Node left;
		private Node right;

		public Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}

	private static Node root;

	public static void insert(int data){
		root = insert(data, root);
	}

	public static Node insert(int data, Node node){
		if(node == null){
			return new Node(data, null, null);
		}
		if(data > node.data){
			node.right = insert(data, node.right);
		}else if(data < node.data){
			node.left = insert(data, node.left);
		}
		return node;
	}

	/**
	 * 前序遍历
	 * 根节点->左节点->右节点
	 * @param node
	 */
	public static void preOrder(Node node){
		if(node != null){
			System.out.print(node.data + " ");
			preOrder(node.left);
			preOrder(node.right);
		}
	}

	/**
	 * 中序遍历
	 * 左节点->根节点->右节点
	 * @param node
	 */
	public static void midOrder(Node node){
		if(node != null){
			midOrder(node.left);
			System.out.print(node.data + " ");
			midOrder(node.right);
		}
	}

	/**
	 * 后续遍历
	 * 左节点->右节点->根节点
	 * @param node
	 */
	public static void posOrder(Node node){
		if(node != null){
			posOrder(node.left);
			posOrder(node.right);
			System.out.print(node.data + " ");
		}
	}

	public static void main(String[] args){
		int[] array = {4 ,2 ,6 ,1 ,3 ,5 ,7 ,8 ,10};
		for(int i=0; i< array.length; i++){
			insert(array[i]);
		}
	//	midOrder(root);
		preOrder(root);
	}
}
