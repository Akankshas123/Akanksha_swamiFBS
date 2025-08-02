package constructor;

class Dummy{
	public Dummy(int a) {
		System.out.println("constructor is here");
		System.out.println("A:"+a);
//		System.out.println("B:"+b);
	}
}

public class Constructor {

	public static void main(String[] args) {
	   int a=10;
	   Dummy d=new Dummy(a);

	}

}
