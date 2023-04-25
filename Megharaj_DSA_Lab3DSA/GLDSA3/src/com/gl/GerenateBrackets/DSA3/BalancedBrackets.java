package com.gl.GerenateBrackets.DSA3;

import java.util.Stack;

// create BalancedBrackets named abstract class .

public abstract class BalancedBrackets {

//  abstract method named isBalanced which takes a string as an input and returns a boolean value.

	public static boolean isBalanced(String expression) {

// isBalanced method uses a stack data structure to check the balance of the brackets.

		Stack<Character> stack = new Stack<Character>();
		for (char c : expression.toCharArray()) {
			if (c == '{' || c == '(' || c == '[') {
				stack.push(c);
			} else if (c == '}' || c == ')' || c == ']') {
				if (stack.isEmpty()) {
					return false;
				}
				char last = stack.peek();
				if ((c == '}' && last == '{') || (c == ')' && last == '(') || (c == ']' && last == '[')) {
					stack.pop();
				} else {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
}