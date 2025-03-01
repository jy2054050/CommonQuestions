package com.common.questions.testPart1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.common.questions.part1.CustomMaxStack;
import com.common.questions.part1.CustomMaxStackImpl;

public class CustomMaxStackTest {
	
	
	private static CustomMaxStack<Integer> stack;
	
	@BeforeAll
	static void setup() {
		stack = new CustomMaxStackImpl<Integer>();
	}
	
	@Test
	void test() {
		
		assertEquals(10, 10);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(5);
		stack.push(12);
		stack.push(0);
		
		assertEquals(0, stack.peek());
		assertEquals(0, stack.pop());
		assertEquals(12, stack.maxPeek());
		assertEquals(12, stack.maxPop());
		assertEquals(5, stack.maxPeek());
		assertEquals(5, stack.peek());
	}
}
