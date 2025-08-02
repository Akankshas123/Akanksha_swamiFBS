#include<stdio.h>
void avg(int*,int*,int*,int*,int*);
void main()
{
    int n1,n2,n3,n4,n5;
    printf("enter five number:\n");
    scanf("%d %d %d %d %d",&n1,&n2,&n3,&n4,&n5);
    avg(&n1,&n2,&n3,&n4,&n5);
}  
void avg(int* n1,int* n2,int* n3,int* n4,int* n5)
{
 float sum=0,avg;

     sum=*n1+*n2+*n3+*n4+*n5;
     avg=sum/5;
    printf("the avg of five numbers %f",avg);
 }