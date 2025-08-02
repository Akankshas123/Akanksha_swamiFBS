#include<stdio.h>
void main()
{
  int num,size;
  printf("enter the size of an array:");
  scanf("%d",&size);

  int arr[size];
  printf("enter the numbers");
   for(int i=0;i<size;i++)
    {
        scanf("%d",&arr[i]);
    }
   printf("even number are");
    for(int i=0;i<size;i++){
        if(arr[i]%2==0){
            printf("%d\n",arr[i]);   //array intialize 
        }
    }
    printf("odd number are");
     for(int i=0;i<size;i++){
        if(arr[i]%2!=0){
            printf("%d\n",arr[i]);
        }
    }

}