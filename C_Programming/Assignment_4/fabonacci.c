#include<stdio.h>
void main(){
    int n,i,a=0,b=1,c;
    printf("enter the number:");
    scanf("%d",&n);
    printf("\nfabonacci series");

    for(i=0;i<=n;i++)
    {
        printf("\n%d",a);
        c=a+b;
        a=b;
        b=c;
    }
    printf("\n");
}

//op
//fabonacci series
//0
// 1
// 1
// 2
// 3
// 5
// 8