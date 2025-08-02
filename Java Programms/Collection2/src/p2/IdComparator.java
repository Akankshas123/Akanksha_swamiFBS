package p2;
import p1.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



public class IdComparator implements Comparator {
    
	@Override
	public int compare(Object o1, Object o2) {
	   Product p1=(Product)o1;
	   Product p2=(Product)o2;
	   return p1.getId()-p2.getId();
	}
  
}

class NameComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Product p1=(Product)o1;
	    Product p2=(Product)o2;
	    
	    String s1=p1.getName();
	    String s2=p2.getName();
		return s1.compareTo(s2);
	}
	
}
class Test{
	public static void main(String[] args) {
		 ArrayList<Product> a1=new ArrayList<Product>();
	     Product p1=new Product(2,"parleg");
	     Product p2=new Product(3,"twenty");
	     Product p3=new Product(4,"goodday");
	     Product p4=new Product(1,"happy");
	     
	     a1.add(p1);
	     a1.add(p2);
	     a1.add(p3);
	     a1.add(p4);
	     
	     
	     
	     System.out.println("before"+a1);
//	     IdComparator c1=new IdComparator();
//	     Collections.sort(a1,c1);
	     
	     NameComparator nc=new NameComparator();
	     Collections.sort(a1,nc);
	     System.out.println("after"+a1);
	}
	
}