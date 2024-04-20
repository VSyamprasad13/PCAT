package com.stackExample;
//Day 4 and 5--> 4.1
import java.util.Stack;

public class CustomStack {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.add(30);
		stack.add(40);
		
		System.out.println("Checking stack is empty or not "+stack.isEmpty());
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
		stack.pop();
		System.out.println("Checking stack is empty or not "+stack.isEmpty());
		
	}

}
