#include<stdio.h>
void sortarray(int*,int);
void main()
{
int arr[]={2,44,12,6};
int n=sizeof(arr)/sizeof(arr[0]);
for(int i=0;i<n;i++)
 {
 	printf("%d ",arr[i]);
 }
}
void sortarray(int arr[],int size){
int i,j,temp;
int n;
for(int i=0;i<n-1;i++)
 {
 	for(j=0;j<n-i-1;j++)
 	{
 		if(arr[j]>arr[j+1])
 		{
 			temp=arr[j];
 			arr[j]=arr[j+1];
 			arr[j+1]=temp;
		 }
	}
 }	
 printf("sorted array: ");
 

}