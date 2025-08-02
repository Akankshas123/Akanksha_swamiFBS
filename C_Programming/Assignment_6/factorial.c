#include<stdio.h>
void fact(int*);
void main(){
   int num;
    printf("enter a number:");
    scanf("%d",&num);
    fact(&num);   //address of that number
}
void fact(int* num)
{   
    int fact=1;
    int temp=*num;//value
    while(*num){
        fact=fact*(*num);
        (*num)--;
    }
    printf("\n factorial no %d is %d",temp,fact);
}