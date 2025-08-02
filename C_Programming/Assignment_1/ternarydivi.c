#include<stdio.h>
void main(){
    int n;
    printf("enter a number:");
    scanf("%d",&n);

    n%3==0 && n%5==0?printf("divisible by both"):
    n%3==0?printf("divisible by 3"):
    n%5==0?printf("divisible by 5"):
    printf("none");
}