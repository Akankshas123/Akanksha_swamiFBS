#include<stdio.h>
int fact(int);
void main(){
   int num;
    printf("enter a number:");
    scanf("%d",&num);
    int x=fact(num);
    printf("%d",x);
    
}
int fact(int num)
{   
    int fact=1;
    int temp=num;
    while(num){
        fact=fact*num;
        num--;
    }
   return fact;
}