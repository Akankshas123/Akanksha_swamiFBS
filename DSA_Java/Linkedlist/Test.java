package p2;
import p1.*;
import p1.Node;

public class Test {

	public static void main(String[] args) {
		Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
    
        first.next=second;
        second.next=third;

        
        System.out.println("first data"+first.data);
        System.out.println("first data refrence"+first.next);
        System.out.println("SEcond data"+second.data);
        System.out.println("Second ref data"+second.next);
        System.out.println("Third data"+third.data);
        System.out.println("Third data ref"+third.next);
}
}