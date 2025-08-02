#include<stdio.h>
void main(){
    int size;
    printf("enter the size of an array: ");
    scanf("%d",&size);
    int arr[size];
    printf("enter the number:");
    for(int i=0;i<size;i++)
    {
        scanf("%d",&arr[i]);
    }
    int sum=0;
    int i;
    for(i=0;i<size;i=i+2)
    {
      sum=sum+arr[i];
    }
    printf("alternate number of addition is %d",sum);
}