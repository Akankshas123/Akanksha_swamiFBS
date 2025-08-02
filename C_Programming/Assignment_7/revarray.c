#include<stdio.h>
void main(){
    int size;
    printf("enter the size of array:");
    scanf("%d",&size);
    int arr[size];
    printf("enter the element in array:");  //take the elements from user
    for(int i=0;i<size;i++){
      scanf("%d",&arr[i]);
    }

    for(int i=0;i<size;i++){  //display elements
        printf("%d",arr[i]);
    }
    
    for(int i=0;i<size/2;i++){
        int temp;
        temp=arr[i];
        arr[i]=arr[size-1-i];  //i continue change 
        arr[size-1-i]=temp;
    }

    for(int i=0;i<size;i++)
    {
        printf("\n%d",arr[i]);
    }


}