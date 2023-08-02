package Stacks;

public class Main {

	public static void main(String[] args) {
		
		Stack Stacky = new Stack(42);
		
		Stacky.printStack();
		Stacky.push(23);
		Stacky.printStack();
		Stacky.push(45);
		Stacky.printStack();
		Stacky.push(49);
		Stacky.push(87);
		Stacky.push(12);
		Stacky.push(2546);
		Stacky.push(576);
		Stacky.printStack();
		Stacky.pop();
		Stacky.pop();
		Stacky.pop();
		Stacky.printStack();
		Stacky.Get(0);
		Stacky.Get(1);
		Stacky.Get(2);
		Stacky.Get(3);
		Stacky.Get(4);
		
		
		
		
	}
	
}
