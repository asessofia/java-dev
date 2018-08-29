package main.java.structures;

// Assignment: Implement Push and Top
public class Stack {

	private static int DEFAULT_MAX_STACK_SIZE = 10;
	private String[] data;
	private int topLevel;
	private int maxSize;

	private void resize() {
		// Implement Parts 1.2 & 2 of algorithm here.

		// increase max size to twice size
		this.maxSize *= 2;
	}

	public Stack() {
		this.data = new String[DEFAULT_MAX_STACK_SIZE];
		this.topLevel = 0;
		this.maxSize = DEFAULT_MAX_STACK_SIZE;
	}

	public void pop() {
		if (this.topLevel != 0) {
			this.topLevel--;
		}
	}

	public void push(String item) {
		if (maxSize == topLevel) {
			this.resize();
		}
		this.data[topLevel] = item;
		++this.topLevel;
	}

	public String top() {
		return data[topLevel - 1];

	}

}
