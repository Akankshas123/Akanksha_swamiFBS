package p1;

public class Test {

	public static void main(String[] args) {
		try {
			int arr[]= {10,2};
		     int a=arr[0];
		     int b=arr[2];
		     int c;
		     c=a/b;
  		     System.out.println("answer is :"+c);
		}
//		    	 if(b==0)
//		    	 {
//		    		 throw new ArithmeticException();
//		    	 }
//		    	 else {
//		    		   c=a/b;
//		  		     System.out.println("answer is :"+c);
//
//		    	 }
		   
		 
		  catch(ArithmeticException e) {
			  System.out.println("plz dont provide 0 in b");
		  }
		 catch(ArrayIndexOutOfBoundsException e) {
			  System.out.println("plz provide 0 or 1");
		  }
		catch(Exception e) {
			  System.out.println("some error");
		  }
			
	}

}
