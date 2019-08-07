package com.stack;

/**
 * @author
 */
public class Stack {

	/**栈的大小 */
	private int size;

	/**栈顶元素的下标*/
	private int top;

	/**
	 * 栈的容器
	 */
	private Object[] stackArray;

	public Stack(int size) {
		this.size = size;
		//初始化栈的时候，栈内无元素，栈顶下标设为-1
		this.top = -1;
		stackArray = new Object[size];
	}

	/**
	 * 入栈，同时，栈顶元素的下标加一
	 * @param elem
	 */
	public void push(Object elem){
		//插入栈顶
		stackArray[++top] = elem;
	}

	/**
	 * 出栈：删除栈顶元素，同时，栈顶元素下标减一
	 * @return
	 */
	public Object pop(){
		return stackArray[top--];
	}

	/**
	 * 查看栈顶元素，但不删除
	 * @return
	 */
	public Object peek(){
		return stackArray[top];
	}

	public boolean isEmpty(){
		return top == -1;
	}

	public boolean isFull(){
		return top == size - 1;
	}


	public static void main(String[] args){
		Stack stack = new Stack(10);
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		stack.push("E");
		stack.push("F");
		stack.push("G");

		while (!stack.isEmpty()){
			System.out.println(stack.pop());
		}
	}

}
