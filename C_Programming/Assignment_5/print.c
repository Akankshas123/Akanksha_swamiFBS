#include<stdio.h>
void print();
void main(){
    print();
}

void print()
{
   int i=1;
   while(i<=10){
        printf("%d\n",i);
        i++;
   }
   printf("\n");
}