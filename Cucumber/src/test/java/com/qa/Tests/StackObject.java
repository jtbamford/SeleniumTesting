package com.qa.Tests;

import java.util.Stack;

public class StackObject {
	
	Stack<String> stack = new Stack<String>();
	
	public void push(String str) {
		stack.push(str);
	}
	
	public String pop() {
		return stack.pop();
	}
	
	public int size() {
		return stack.size();
	}

}
