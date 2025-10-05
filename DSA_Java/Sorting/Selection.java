package p2;

public class Selection {

	public static void main(String[] args) {
		int arr[]= {9,21,2,35,30};
		int size=arr.length;
		
		for(int i=0;i<size;i++) {
			int min=i;
			for(int j=i+1;j<size;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		System.out.println("sorted array.");
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
		
		
	}

}
