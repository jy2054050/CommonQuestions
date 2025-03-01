package com.common.questions.part1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class CustomMaxStackImpl<T>  implements CustomMaxStack<T> {
	
	
	PriorityQueue<T> pq;
	LinkedList<T> list ;
	
	public CustomMaxStackImpl(){
		pq = new PriorityQueue<>(Collections.reverseOrder());
		list = new LinkedList<>();
	}
	

	@Override
	public T peek() {
		return list.getFirst();
	}

	@Override
	public void push(T element) {
		list.addFirst(element);
		pq.offer(element);
	}

	@Override
	public T pop() {
		T node = list.getFirst();
		list.remove(node);
		pq.remove(node);
		return node;
	}

	@Override
	public T maxPeek() {
		return pq.peek();
	}

	@Override
	public T maxPop() {
		T node = pq.poll();
		list.remove(node);
		return node;
	}

}
