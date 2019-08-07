package com.list;

public class StackSingleLink {

	private SingleLinkedList link;

	public StackSingleLink(SingleLinkedList singleLinkedList) {
		this.link = singleLinkedList;
	}

	public void push(Object obj){
		link.addHead(obj);
	}
	
	public Object pop(){
		return link.deleteHead();
	}

	public boolean isEmpty(){
		return link.isEmpty();
	}

	public void display(){
		link.display();
	}

	public static void main(String[] args){
		StackSingleLink link = new StackSingleLink(new SingleLinkedList());
		link.push("A");
		link.push("B");
		link.push("B");
		link.push("A");
		link.display();

		link.pop();
		link.display();
	}
}
