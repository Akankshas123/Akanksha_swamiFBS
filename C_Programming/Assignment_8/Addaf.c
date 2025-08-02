#include<stdio.h>
void storeArray(int,int*);
void display(int,int*);
void addtwoarray(int,int*,int*);
void main()
{
   int num,size;
   printf("enter the size of an array:");
   scanf("%d",&size);
  
    int arr[size];
 
    int brr[size];
   storeArray(size,arr);
    display(size,arr);
   storeArray(size,brr);
    display(size,brr);
    addtwoarray(size,arr,brr);
}
    
  
void storeArray(int size,int* arr)
{
  printf("enter the numbers\n");
   for(int i=0;i<size;i++)
    {
      
         scanf("\n%d",&arr[i]);
    }
  }

 void display(int size,int*brr){
   printf("enter the numbers\n");
   for(int i=0;i<size;i++)
     {
         printf("\n%d",brr[i]);
     }
 }
 void addtwoarray(int size,int*arr,int*brr)
 {
    int crr[size];
    for(int i=0;i<size;i++)
         {
            crr[i]=arr[i]+brr[i];
         printf("\n%d",crr[i]);
     }
    }