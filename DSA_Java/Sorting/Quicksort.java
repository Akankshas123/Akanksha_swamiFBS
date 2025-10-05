package p4;

public class Quicksort {
int[] numbers= {22,12,1,66,3,21};
	public static void main(String[] args) {
        Quicksort app=new Quicksort();
        app.quick(app.numbers);
        app.print();
 

	}
	
	public void print() {
		for(int ctr=0;ctr<numbers.length;ctr++) {
			System.out.println(numbers[ctr]+"");
		}
		System.out.println();
	}
	
	public void quick(int[] ref) {
		sort(ref,0,ref.length-1);
	}
	public void sort(int[] arr,int low,int high) 
	{
		if(low<high) {
			int divisionpos=divide(arr,low,high);
				sort(arr,low,divisionpos-1);
				sort(arr,divisionpos+1,high);
			
		}
	}

	
	public int divide(int[] ref,int low,int high) //low=0 high =n-1
	{
		int pivote=ref[high];
		int first=low-1;
		
		for(int second=low;second<high;second++) {
			if(ref[second]<=pivote) {
				first++;
				int temp=ref[first];
				ref[first]=ref[second];
				ref[second]=temp;
			}
		}
		
		int temp=ref[first+1];
		ref[first+1]=ref[high];
		ref[high]=temp;
		return first+1;
		
	}
}
