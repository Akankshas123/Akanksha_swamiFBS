#include<stdio.h>
void main()
{
  int arr[10];
  printf("enter the numbers");
   for(int i=0;i<3;i++)
    {
        scanf("%d",&arr[i]);
    }
  int brr[5];
  printf("enter the numbers");
   for(int i=0;i<3;i++)
    {
        scanf("%d",&brr[i]);
    }
    
    for(int i=0;i<6;i++)
    {
        arr[3+i]=brr[i];
    }

    for(int i=0;i<6;i++){
    printf("%d",arr[i]);
    }
}