#include<stdio.h>
void main(){
    int size,num;
    printf("enter the size of an array:");
    scanf("%d",&size);
    int arr[size];
    printf("enter the number:");
    for(int i=0;i<size;i++)
    {
        scanf("%d",&arr[i]);
    }

    // int arr[size];
    int sum=0;
    for(int i=0;i<size;i++)
    {
        sum=sum+arr[i];
    }
   printf("%d",sum);
}