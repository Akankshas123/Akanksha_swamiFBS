package p5;

public class Test {
    
	int top;
	int [] mystack;
	int size;
	public Test(int size) {
		super();
		this.top = -1;
		this.size = size;
		this.mystack = new int [size];
	
	}
	
	
	public boolean isFull() {
		if(top==size-1) 
			return true;
			else
				return false;
		}
	
	public boolean isEmpty() {
		if(top==-1)
			return true;
		else
			return false;
	}
	
	public void push(int ele) {
		if(isFull()) {
			System.out.println("Stack overflow");
		}
		else {
			mystack[++top]=ele;
			System.out.println("Data inserted..");
		}
	}
	
	public void pop() {
		if(isEmpty()) {
			System.out.println("Stack underflow");
		}
		else {
		   System.out.println(mystack[top--]+" element popped..");
			
		}
	}
	
	public void peek() {
		if(isEmpty()) {
			System.out.println("stack underflow");
		}
		else {
			System.out.println(mystack[top]+"is on the top");
		}
	}
	
	
	public void display() {
		if(isEmpty()) {
			System.out.println("Stack underflow");
		}
		else {
			for(int i=0;i<=top;i++) {
				System.out.println("\t"+mystack[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		Test t1=new Test(5);
		t1.push(10);
		t1.push(20);
		t1.push(30);
		t1.push(40);
		t1.display();
		t1.peek();
		t1.pop();
		t1.display();
	}
}