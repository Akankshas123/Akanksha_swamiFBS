#include<stdio.h>
int add(int,int);
void main()
{

    int a,b,c;
    a=10;
    b=30;
    printf("enter the value of a and b:");
    scanf("%d%d",&a,&b);
    add(a,b);
}
int add(int a,int b)
{
   int c=a+b;
    printf("%d",c);
}