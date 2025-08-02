package p1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;

class Player {

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
	
	public String toString() {
		return "Player [jerseynumber=" + jerseynumber + ", run=" + run + ", wicket=" + wicket + ", name=" + name + "]";
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
	public static void main(String[]args) {
		TreeSet<Player> p3=new TreeSet<Player>();
		p3.add(new Player(1,"akki",20,5));
		p3.add(new Player(2,"vedant",28,6));
		p3.add(new Player(3,"Shivam",27,79));
		
		System.out.println(p3);
	}
}
 
 