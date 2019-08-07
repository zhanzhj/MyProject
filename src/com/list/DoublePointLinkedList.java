package com.list;

public class DoublePointLinkedList {
	//头结点
	private Node head;
	//尾节点
	private Node tail;
	private int size;

	private class Node{
		private Object data;
		private Node next;

		public Node(Object data) {
			this.data = data;
		}
	}

	public DoublePointLinkedList() {
		size = 0;
		head = null;
		tail = null;
	}

	public void addHead(Object data){
		Node node = new Node(data);
		if(size == 0){
			head = node;
			tail = node;
			size++;
		}else {
			node.next = head;
			head = node;
			size++;
		}
	}

	public void addTail(Object data){
		Node node = new Node(data);
		if(size == 0){
			head = node;
			tail = node;
			size++;
		}else {
			tail.next = node;
			tail = node;
			size++;
		}
	}

	public boolean deleteHead(){
		if(size == 0){
			return false;
		}
		// head.next == null 表示节点数为1
		if(head.next == null){
			head = null;
			tail = null;
		}else {
			head = head.next;
		}
		size--;
		return true;
	}

	public boolean isEmpty(){
		return  size == 0;
	}

	public int getSize(){
		return size;
	}
}
