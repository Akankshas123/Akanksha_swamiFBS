package p1;

public class Demo {
    int start,end;
    int[] myqueue;
    int size;
	public Demo(int size) {
		this.start=-1;
		this.end = -1;
		this.size = size;
		this.myqueue=new int[size];
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
    
	public void insert(int d) {
		if(start==-1 && end==-1) {
			myqueue[++start] = d;
			++end;
		}else {
			myqueue[++end]=d;
		}
	
	}
	
	public void display() {
		System.out.println("Elements in Queue : ");
		for(int i=start;i<=end;i++) {
			System.out.print("\t"+myqueue[i]);
		}
	}
}
