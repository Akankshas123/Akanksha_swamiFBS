#include<stdio.h>
void strong(int*);
void main(){
    int n=145;
    strong(&n);
}
void strong(int* n)
{
    int temp,rem,sum=0,i,fact;
    temp=*n;
    while(*n){
        i=1;
        fact=1;
        rem=*n%10;
        while(i<=rem){
            fact=fact*i;
            i++;
        }
        sum=sum+fact;
        *n=*n/10;
    }
    if(sum==temp){
        printf("strongnumber");
    }
    else{
        printf("not strong");
    }
}