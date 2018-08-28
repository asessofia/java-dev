package main.java.structures;

// Assignment: Implement Push and Top
public class Stack {

	private static int DEFAULT_MAX_STACK_SIZE = 10;
	private String[] data;
	private int topLevel;

	public Stack() {
		this.data = new String[DEFAULT_MAX_STACK_SIZE];
		this.topLevel = 0;
	}

	public void pop() {
		if (this.topLevel != 0) {
			this.topLevel--; // equiv to this.topLevel = this.topLevel - 1
		}
	}
	
	public void push(String item) {
		// TODO: IMPLEMENT PUSH
		if (item ==Stack)
		{
			extendStack();
		}
			stack[top]=1
		
	}
	
	public String top() {
		// TODO: IMPLEMENT TOP
		if (this.topLevel==0)
		return null; // STUB
	}

}
