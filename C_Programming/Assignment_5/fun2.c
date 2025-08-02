#include<stdio.h>
void age();
void peri();
void add();
void main()
{
  age();
  peri();
  add();
}
void age()
{
    int n1,n2,n3,n4,n5,avg ,sum;
    printf("enter five number:\n");
    scanf("%d %d %d %d %d",&n1,&n2,&n3,&n4,&n5);
    sum=n1+n2+n3+n4+n5;
    avg=sum/5;
    printf("the avg of five numbers %d",avg);
 }


void peri()
{
    int l=30,w=40,p;
    p=(l+w)/2;
    printf("perimeter of rect %d",p);
}

void add()
{
    int a,b,c;
    a=10;
    b=30;
    c=a+b;
    printf("Addition of two number c=%d",c);
}