package p1;

public class Reverse {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40};
		int temp,size =arr.length;
		for(int i=0;i<size/2;i++) {
			 temp=arr[i];
			 arr[i]=arr[size-1-i];
			 arr[size-1-i]=temp;
		}
       for(int i=0;i<size;i++) {
    	   System.out.println(arr[i]);
       }
	}

}
