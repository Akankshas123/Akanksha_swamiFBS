#include<stdio.h>
void main()
{
    int size;
    printf("enter the size of an array: ");
    scanf("%d",&size);
    int arr[size];
    printf("enter the number:");

    for(int i=0;i<size;i++)
    {
        scanf("%d",&arr[i]);
    }

    int max=arr[0];
    for(int i=1;i<size;i++)
    {
        if(arr[i]>max){
            max=arr[i];
        }
    }
    printf("the max number is %d",max);

    int min=arr[0];
    for(int i=1;i<size;i++)
    {
        if(arr[i]<min){
            min=arr[i];
        }
    }
    printf("the min number is %d",min);
}
