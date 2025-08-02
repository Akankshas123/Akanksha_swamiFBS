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
  printf("array is:");
    for(int i=0;i<size;i++)
    {
         printf("%d",arr[i]);
    }
   printf("print prime number is:");
   for(int i=0;i<size;i++)
   {
      int flag=0;
      for(int j=2;j<=arr[i]/2;j++)
      {
        if(arr[i]%j==0){
            flag=1;
            break;
        }
      }
      if(flag==0)
        printf("%d",arr[i]);
   }
}   