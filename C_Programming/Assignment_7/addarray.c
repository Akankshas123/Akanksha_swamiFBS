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
  int brr[size];
  printf("enter the numbers");
   for(int i=0;i<size;i++)
    {
        scanf("%d",&brr[i]);
    }

    int crr[size];
    for(int i=0;i<size;i++)
    {
        crr[i]=arr[i]+brr[i];
        printf("%d",crr[i]);
    }
    }
//     printf("%d",crr[i]);
// }