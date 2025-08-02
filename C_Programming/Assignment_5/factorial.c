#include<stdio.h>
void fact(int);
void main(){
   int num;
    printf("enter a number:");
    scanf("%d",&num);
    fact(num);
}
void fact(int num)
{   
    int fact=1;
    int temp=num;
    while(num){
        fact=fact*num;
        num--;
    }
    printf("\n factorial no %d is %d",temp,fact);
}