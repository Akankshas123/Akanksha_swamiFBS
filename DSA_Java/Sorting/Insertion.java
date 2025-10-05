package p3;

public class Insertion {

	public static void main(String[] args) {
		int arr[]= {9,21,2,35,30};
		int size=arr.length;
		int temp=0;
		
		for(int i=0;i<size;i++) {
			int boundry=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>boundry) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=boundry;
		}
			
			
		System.out.println("sorted array.");
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}

	}

}
