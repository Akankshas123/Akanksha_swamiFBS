package p6;

public class Heapsort {
   int numbers[]= {23,12,1,66,3,21};
   
   public static void main(String[] args) {
	   Heapsort h1=new Heapsort();
	   h1.sort(h1.numbers);
	   h1.print();
   }
   
   public void print() {
	   for(int ctr=0;ctr<numbers.length;ctr++) {
		   System.out.println(numbers[ctr]+ " ");
	   }
	   System.out.println();
   }
   
   public void sort(int[] ref) {
	   int length=ref.length;
	   for(int ctr=length/2-1;ctr>=0;ctr--) {
		   heapify(ref,length,ctr); 
	   }
	   for(int ctr=length-1;ctr>0;ctr--) {
		  int temp=ref[0];
		  ref[0]=ref[ctr];
		  ref[ctr]=temp;
	   
		  heapify(ref,ctr,0);
	   }}
	public void heapify(int[] ref,int length,int start) {
		int largest=start;
		
		int left=2*start+1;
		
		int right=2*start+2;
		
		if(left<length && ref[left]>ref[largest]) {
			largest=left;
		}
	
		
		if(right<length && ref[right]>ref[largest]) {
			largest=right;
		}
	
		if(largest != start) {
			int temp = ref[start];
			ref[start] =ref[largest];
			ref[largest]=temp;
			
			heapify(ref,length,largest);
		}
	
   }
}
