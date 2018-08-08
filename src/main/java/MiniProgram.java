package main.java;

public class MiniProgram {
	
	public void outputField(String fieldName, Object fieldValue) {
		System.out.println(fieldName + ": " + fieldValue);
	}

	// classes extending should override this
	public void execute() {
		
	}
}
