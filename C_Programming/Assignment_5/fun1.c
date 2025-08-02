#include<stdio.h>
void swap();
void sqrcub();
void main()
{
    swap();
    sqrcub();
}
void swap()
{
    int a=20,b=80,temp;
    temp=a;
    a=b;
    b=temp;
    printf("a=%d,b=%d\n",a,b);
} 
    
void sqrcub()
{
    int num=10, sq,cube;
    sq=num*num;
    printf("square of number %d",sq);

    cube=num*num*num;
    printf("cube of number %d", cube);
}
