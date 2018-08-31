package main.java;

import main.java.structures.Stack;

public class StackProgram extends MiniProgram {

	private void output(String label, Object value) {
		System.out.println(label + ": " + value);
	}

	private void testStackEmpty(Stack s) {
		output("Stack Empty: ", s.isEmpty());
	}

	private void outputStackInReverse(Stack stack) {
		for (Integer i = 10; i >= 0; i--) {
			output("Size of Stack", stack.size());
			output("Top of the Stack", stack.top());
			stack.pop();
		}
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

		testStackEmpty(stack);
		outputStackInReverse(stack);
		testStackEmpty(stack); // <- Before assignment returns true.. after returns false
		
		// Assignment: Modify outputStackInReverse to output the stack WITHOUT modifying its size
		// hint: use two stacks and think about copying back and forth to keep original stack restored after the printing is done

	}

}
