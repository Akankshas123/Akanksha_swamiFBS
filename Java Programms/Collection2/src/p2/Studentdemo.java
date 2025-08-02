package p2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;


class Student implements Comparable<Student>{
	int rollno;
	String name;
	int marks;
	public Student() {
		this.rollno=0;
		this.name="not given";
		this.marks=0;
	}
	public Student(int rollno, String name, int marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student \nrollno=" + rollno + ", name=" + name + ", marks=" + marks ;
	}  //to string complete here

	@Override
	public int compareTo(Student s) {
		
		System.out.println("inside compare to");
	    return this.rollno-s.rollno;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("euals ");
		 Student s1=(Student)obj;
		 if(this.rollno==s1.rollno)
		 {
			 return true;
	
		 }
		 else {
			 return false;
		 }
	}
	@Override
	public int hashCode() {
		System.out.println("Inside hashcode");
		return this.rollno;
	}
}//main ends here

public class Studentdemo {

	public static void main1(String[] args) {
	
     ArrayList<Student> a1=new ArrayList<Student>();
     a1.add(new Student(28,"Akanksha",50));
     a1.add(new Student(28,"Vedant",50));
     a1.add(new Student(28,"Shivam",50));
     System.out.println(a1);
     Collections.sort(a1);
     Student s4=new Student(12,"Mansi",80);
     if(a1.contains(new Student(28,"Shivam",50))) {
    	 System.out.println("found");
     }
     else {
    	 System.out.println(" not found");
     }
}   //arraylist ends here
	
public static void main2(String[] args) {
		
	     LinkedList<Student> l1=new LinkedList<Student>();
	     l1.add(new Student(28,"Akanksha",50));
	     l1.add(new Student(28,"Vedant",50));
	     l1.add(new Student(28,"Shivam",50));
	     System.out.println(l1);
	     Student s4=new Student(12,"Mansi",80);
	     if(l1.contains(new Student(28,"Shivam",50))) {
	    	 System.out.println("found");
	     }
	     else {
	    	 System.out.println(" not found");
	     }
}      //linkedlist ends here linkedlist use euals to method
	
public static void main3(String[] args) {
	
    TreeSet<Student> a1=new TreeSet<Student>();
    a1.add(new Student(28,"Akanksha",50));
    a1.add(new Student(28,"Vedant",50));
    a1.add(new Student(28,"Shivam",50));
    System.out.println(a1);
    Student s4=new Student(12,"Mansi",80);
    if(a1.contains(new Student(28,"Shivam",50))) {
   	 System.out.println("found");
    }
    else {
   	 System.out.println(" not found");
    }
}    // for treeset compare to use

public static void main(String[] args) {
	
    HashSet<Student> h1=new HashSet<Student>();
    h1.add(new Student(28,"Akanksha",50));
    h1.add(new Student(28,"Vedant",50));
    h1.add(new Student(28,"Shivam",50));
    System.out.println(h1);
    Student s4=new Student(12,"Mansi",80);
    if(h1.contains(new Student(28,"Shivam",50))) {
   	 System.out.println("found");
    }
    else {
   	 System.out.println(" not found");
    }
}    //hashset use for hashcode
	
}
