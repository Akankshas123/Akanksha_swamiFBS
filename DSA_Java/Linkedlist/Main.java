package p4;
import p3.*;

public class Main {

	Node Start;

	public static void main(String[] args) {
		Node n1=new Node(10);
		Node n2=new Node(20);
		Node n3=new Node(30);
		Node temp=new Node(40);
		Node n5=new Node(60);
		Main m1=new Main();
		
		m1.insertAtend(n1);
		m1.insertAtend(n2);
		m1.insertAtend(n3);
		m1.insertAtbeg(temp);
		m1.insertatpos(n5,3);   //position at 3
		m1.display();


	}
   
	 void insertAtend(Node ref) {
		if(Start==null) {
			Start=ref;
		}
		else {
			Node Current=Start;
			while(Current.next!=null) {
				Current=Current.next;
			}
			Current.next=ref;           //at the end add
		}	
		
	}
	 void display() {
//		  System.out.println("Start data"+Start.data);
//		  System.out.println("Start data"+Start.next);
		 if(Start==null) {
			 System.out.println("no node insert");
		 }
		 else {
			 Node itr=Start;
			 while(itr.next!=null) {
				 System.out.print("["+itr.getData()+"]"+"->");
				 itr=itr.next;
			 }
			 System.out.print("["+itr.getData()+"]"+"->null");   
		 }
	 }

	 void insertAtbeg(Node temp){   //insert at beg in the linkedlist
		
		 temp.next=Start;
		 Start=temp;
	}
	 
	  void insertatpos(Node n5,int pos) {
		  int count=1;
		  Node itr=Start;
		  while((count<pos-1)&&(itr.next!=null)) {
			  count++;
		  itr=itr.next;
		  
	  }
	   n5.next=itr.next;
	   itr.next=n5;

}}
