package org.rgit.lesson1;

public class FirstPgm {
	int firstNumber=5;
	int secondNumber=4;
	float output;
	void add() {
		output=firstNumber+secondNumber;
		System.out.println(output);
	}
	void subtract() {
		output=firstNumber-secondNumber;
	System.out.println(output);
	}
	void multiply() {
		output=firstNumber*secondNumber;
	System.out.println(output);
	}
	void divide() {
		output=firstNumber/secondNumber;
	System.out.println(output);
	}
	public static void main(String[] args) {
		FirstPgm x= new FirstPgm();
		x.add();
	}

}
