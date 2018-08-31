package main.java;

import main.java.structures.Stack;

public class StackProgram extends MiniProgram {

	private void output(String label, Object value) {
		System.out.println(label + ": " + value);
	}

	private void testStackEmpty(Stack s) {
		output("Stack Empty: ", s.isEmpty());
	}

	@Override
	public void execute() {
		System.out.println("EXECUTING STACK PROGRAM\n");
		Stack stack = new Stack();
		testStackEmpty(stack);

		// Step 1: push Strings "0" -> "10" onto the stack

		for (Integer i = 0; i <= 10; i++) {
			stack.push(i.toString());
		}

		// Step 2: Test if stack is empty
		testStackEmpty(stack);

		// Step 3: Print the stack in reverse.
		for (Integer i = 10; i >= 0; i--) {
			output("Top of the Stack", stack.top());

			stack.pop();

		}

	}

}
