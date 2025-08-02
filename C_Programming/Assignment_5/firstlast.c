#include<stdio.h>
int firstlast(int);
void main(){
    int num,sum;
    printf("enter a number");
    scanf("%d",&num);
    // firstlast(num);
    printf("the sum of two numbers %d",firstlast(num));
}
int firstlast(int num)
{
    int sum,fdigit,ldigit;
    ldigit=num%10;
    while(num>=10)
    {
       num=num/10;
    }
    fdigit=num;
    sum=fdigit+ldigit;
    printf("the first digit number is %d\n",fdigit);
    printf("the last digit number is %d\n",ldigit);
    return sum;
}