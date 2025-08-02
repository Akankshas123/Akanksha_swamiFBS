package p1;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList <String>a1=new<String> ArrayList();
//		a1.add(10);
//		a1.add(30);
//		a1.add(20);
		a1.add("Akanksha");
		a1.add("aboli");
//		a1.add(1);
		System.out.println(a1);
        for(int i=0;i<a1.size();i++) {
//        	System.out.println(a1.get(i));
        	
        	String str=(String)a1.get(i);
        	System.out.println(str.charAt(i));
        }
	}

}
