#include<stdio.h>
int strong(int);
void main(){
    int n=143,temp;
    strong(n);
    if(temp==1)
    printf("strong");
    else
    printf("not strong");
}
int strong(int n)
{
    int temp,rem,sum=0,i,fact;
    temp=n;
    while(n){
        i=1;
        fact=1;
        rem=n%10;
        while(i<=rem){
            fact=fact*i;
            i++;
        }
        sum=sum+fact;
        n=n/10;
    }
    if(sum==temp)
      return 1;
    else
      return 0;
}