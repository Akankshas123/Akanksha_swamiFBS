package p1;

public class Bubblesort {

	public static void main(String[] args) {
		int arr[]= {28,21,92,35,50};
		int size=arr.length;
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		System.out.println("sorted array");
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
	}

}
