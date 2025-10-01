//singleton

package p1;
public class Mainapp {
   
	public static void main(String[] args) {
	Mainapp myapp=new Mainapp();
	
	myapp.insert(50);
	
		
	}
	
	public void insert(int value) {
		Mystack ref=Mystack.getObject();   
		ref.push(value);
	}
	
	
	public void delete(int value) {
		Mystack ref=Mystack.getObject();
	   ref.pop();
	}
}
