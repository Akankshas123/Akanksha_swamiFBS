#include<stdio.h>
void prime(int*);
void main(){
    int n;
    printf("enter the number\n",n);
    scanf("%d",&n);
    prime(&n);
}
void prime(int* n)
{
    int i=2,flag=0;
    while(i<*n)
    {
       if(*n%i==0){
        flag=1;
        break;
       }
       i++;
    }
       if(flag==0){
        printf("number is prime");
       }
       else{
        printf("number is not prime");
       }
  }
