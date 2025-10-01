package p1;

public class Mystack {
	   
		int top;
	    private int [] mystack;
		 static int size;
		 static Mystack ref;
		private Mystack(int size) {
			
			this.top = -1;
			this.size = size;
			this.mystack = new int [size];
		
		}
		
		public static Mystack getObject() {
			if(ref==null) {
				ref=new Mystack(5);
			}
			
			return ref;
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
		
}
