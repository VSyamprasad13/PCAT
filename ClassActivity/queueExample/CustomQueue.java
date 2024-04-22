package com.queueExample;
// Day 4 and 5--> Task 4.2
import java.util.ArrayDeque;

public class CustomQueue {

	public static void main(String[] args) {
		ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
		
		deque.add(10);
		deque.add(20);
		deque.add(30);
		deque.add(40);
		System.out.println("Checking queue is empty or not "+deque.isEmpty());
		System.out.println("Last element "+deque.peekLast());
		System.out.println("First Element "+deque.peekFirst());
		System.out.println(deque.peek());
		deque.pop();
		deque.pop();
		deque.pop();
		deque.pop();
		System.out.println("Checking queue is empty or not "+deque.isEmpty());
		
	}

}
