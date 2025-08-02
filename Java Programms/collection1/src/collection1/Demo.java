package collection1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;
import java.util.TreeSet;

class Player implements Comparable<Player> {

	int jerseynumber,run,wicket;
	String name;
	Player(){
		this.jerseynumber=0;
		this.name="not given";
		this.run=0;
		this.wicket=0;
	}
	Player(int jno,String n,int r,int w){
		this.jerseynumber=jno;
		this.name=n;
		this.run=r;
		this.wicket=w;
	}
	public int getJerseynumber() {
		return jerseynumber;
	}
	public void setJerseynumber(int jerseynumber) {
		this.jerseynumber = jerseynumber;
	}
	public int getRun() {
		return run;
	}
	public void setRun(int run) {
		this.run = run;
	}
	public int getWicket() {
		return wicket;
	}
	public void setWicket(int wicket) {
		this.wicket = wicket;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "\nPlayer [jerseynumber=" + jerseynumber + ", run=" + run + ", wicket=" + wicket + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Player p) {
		System.out.println("Inside compare to");
		return this.jerseynumber-p.jerseynumber;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		 System.out.println("euals ");
		 Player o2=(Player)obj;
		 if(this.jerseynumber==o2.jerseynumber)
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
		return this.jerseynumber;
		
	}
	
}
 public class Demo{
	public static void main1(String[]args) {
		ArrayList<Player> p1=new ArrayList<Player>();
		p1.add(new Player(1,"akki",20,5));
		System.out.println(p1);
	}
	public static void main2(String[]args) {
		LinkedList <Player> p2=new LinkedList<Player>();
		p2.add(new Player(1,"akki",20,5));
		System.out.println(p2);
	}
	public static void main3(String[]args) {
		TreeSet<Player> p3=new TreeSet<Player>();
		p3.add(new Player(2,"akki",20,5));
		p3.add(new Player(18,"virat",30,6));
		p3.add(new Player(7,"Shivam",27,79));
	}	
//		System.out.println(p3);
	public static void main4(String[]args) {
		ArrayList<Player> plist=new ArrayList<Player>();
		plist.add(new Player(2,"akki",20,5));
		plist.add(new Player(18,"virat",30,6));
		plist.add(new Player(7,"Shivam",27,79));
		Player p4=new Player(8,"Anuj",70,70);
		System.out.println(plist);
		if(plist.contains(p4)) {
			System.out.println("found");
		}
		else {
			System.out.println("not found");
		}
	}	
	
	
	public static void main(String[]args) {
		HashSet<Player> h1=new HashSet<Player>();
		h1.add(new Player(2,"akki",20,5));
		h1.add(new Player(18,"vedant",30,6));
		h1.add(new Player(7,"Shivam",27,79));
		
		if(h1.contains(new Player(7,"Shivam",27,79))) {
			System.out.println("found");
		}
		else {
			System.out.println("not found");
		}
}}
 
 