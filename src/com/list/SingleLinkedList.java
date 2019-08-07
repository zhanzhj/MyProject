package com.list;

public class SingleLinkedList {
	private int size; //链表节点的个数
	private Node head; //头结点

	public SingleLinkedList() {
		size = 0;
		head = null;
	}

	private class Node{
		private Object data; //节点数据
		private Node next; //每个节点指向下一个节点的连接

		public Node(Object data) {
			this.data = data;
		}
	}

	/**
	 * 在链表头添加元素
	 * @param obj
	 * @return
	 */
	public Object addHead(Object obj){
		Node newHead = new Node(obj);
		if(size == 0){
			head = newHead;
		}else {
			newHead.next = head;
			head = newHead;
		}
		size++;
		return obj;
	}

	/**
	 * 在链表头删除元素
	 * @return
	 */
	public Object deleteHead(){
		Object object = head.data;
		head = head.next;
		size--;
		return object;
	}

	/**
	 * 查找指定元素，找到返回节点Node,找不到返回NULL
	 * @param obj
	 * @return
	 */
	public Node find(Object obj){
		Node current = head;
		int tempSize = size;
		while (tempSize > 0){
			if(obj.equals(current.data)){
				return current;
			}else {
				current = current.next;
			}
			size--;
		}
		return null;
	}

	/**
	 * 删除指定的元素，删除成功返回true
	 * @param value
	 * @return
	 */
	public boolean delete(Object value){
		if(size == 0){
			return false;
		}
		Node current = head;
		Node previous = head;
		while (current.data != value){
			if(current.next == null){
				return false;
			}else {
				previous = current;
				current = current.next;
			}
		}
		//如果删除的节点是第一个节点
		if(current == head){
			head = current.next;
			size--;
		}else {
			previous.next = current.next;
			size--;
		}
		return true;
	}

	public boolean isEmpty(){
		return size == 0;
	}

	public void display(){
		if(size > 0){
			Node node = head;
			int tempSize = size;
			if(tempSize == 1){
				System.out.println("[" + node.data +"]");
				return;
			}
			while (tempSize > 0){
				if(node.equals(head)){
					System.out.print("[" + node.data +"->");
				}else if(node.next == null){
					System.out.println(node.data +"]");
				}else {
					System.out.print(node.data +"->");
				}
				node = node.next;
				tempSize--;
			}
		}else {
			System.out.println("[]");
		}
	}

	public static void main(String []args){
		SingleLinkedList list = new SingleLinkedList();
		list.addHead("A");
		list.addHead("B");
		list.addHead("C");
		list.addHead("D");

		list.display();

		list.delete("C");
		list.display();

		System.out.println("find B " + list.find("B"));
	}
}
