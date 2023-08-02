package Stacks;

//In a linked list, we would start with these variables
//private Node head;		
//private Node tail;
//but with a stack, instead of "head" we have "top"
//we have no tail but we have bottom but we dont use that
//instead of length, we have height


public class Stack {
	
	private Node top;
	private int height;
	
	Stack(int value){
		Node nodey = new Node(value);
//		head = nodey
		top = nodey;
		height = 1;
		
	}
	
	public void printStack() {
		Node trav = top;
		System.out.println("*********Stack printout********");
		while(trav != null) {
			System.out.println(trav.value);
			trav = trav.next;
		}
		System.out.println("==========================" + "\n");
	}
	
//	With stacks, you cannot remove from nor add to the bottom(tail).
//	prepend => push		removeFirst => pop

//	because this is a stack, push will add to the top(front) by default
	public void push(int value) {
		Node trav = top;		//reference variable
		Node nodey = new Node(value);	//creating a new node
		if (height == 0) {
			top = nodey;
		}else {
			nodey.next = top;
			top = nodey;
		}
		height++; 
		System.out.println("Adding in " + nodey.value + " to the front. \n");
//		System.out.println('&nbsp');
		
	}
	
//	because this is a stack, pop will remove from the top(front) by default
	public void pop () {
		Node trav = top;
		if (height == 0) {
			System.out.println("Stack is empty");
		}
		else {
			System.out.println("Removing the top node " + top.value + " from the stack.  \n");
			top = top.next;		//the top node points to the next node
			trav.next = null;	//the reference node is set to point to nothing
		}
		height--;
	}
	
	public void getTop() {
		if (height == 0) {
			System.out.println("Stack is empty");
		}
		else {
			System.out.println("Top value: = " + top.value);
		}
	}
	
	public void getHeight() {
		System.out.println("height: " + height);
	}
	
	public void Get(int level) {
		Node trav = top;
		if (height == 0) {
			System.out.println("Stack is empty");
		}
		else if (height == 1) {
			System.out.println("There is only one node in this stack: " + trav.value);
//			return trav;
		} else  if (height > 1){
			for (int i = 0; i < level-1; i++) {
				trav = trav.next;
			}
			System.out.println("At level " + level + ", there is " + trav.value);
			
		}
//		return trav;
	}
	
	public void Set(int index, int value) {
		
	}

	
}
