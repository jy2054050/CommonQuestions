package com.common.questions.part1;

public interface CustomMaxStack<T> {

	T peek();
	
	void push(T element);
	
	T pop();
	
	T maxPeek();
	
	T maxPop();

}
