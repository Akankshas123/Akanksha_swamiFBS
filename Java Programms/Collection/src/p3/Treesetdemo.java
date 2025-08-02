package p3;

import java.util.TreeSet;

public class Treesetdemo {

	public static void main(String[] args) {
		TreeSet t1=new TreeSet();    //camelcase
		t1.add(10);
		t1.add(30);
		t1.add(20);
		System.out.println(t1);
		
		
		TreeSet<String> t2=new TreeSet<String>();
		t2.add("abc");
		t2.add("xyz");
		System.out.println(t2);
	}

}
