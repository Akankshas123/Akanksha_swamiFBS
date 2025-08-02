#include<stdio.h>
int prime(int);
void main(){
    int n;
    printf("enter the number\n",n);
    scanf("%d",&n);
    int x=prime(n);
    if(x==1)
    printf("the number is prime");
    else
    printf("not prime");
}
int prime(int n)
{
    int i=2,flag=0;
    while(i<n)
    {
       if(n%i==0){
        flag=1;
        break;
       }
       i++;
    }
       if(flag==0)
       return 1;
       else
       return 0;
 }
