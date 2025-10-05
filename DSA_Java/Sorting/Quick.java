package p4;

public class Quick {

	public static void main(String[] args) {
		int arr[]= {5,20,4,5,7,3};
		int size=arr.length;
		int PVOT=arr[size-1];
		int j=-1;
		
		
		for(int i=0;i<size-1;i++) {
			if(arr[i]<=PVOT) {
				j++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		
		int temp=arr[j+1];
		arr[j+1]=arr[size-1];
		arr[size-1]=temp;
		
		
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}

	}

}
