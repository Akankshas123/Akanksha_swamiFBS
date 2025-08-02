#include<stdio.h>
int sum(int,int);
void main(){
    int n1,n2;
    printf("enter a number:");
    scanf("%d%d",&n1,&n2);
    sum(n1,n2);
}
int sum(int n1,int n2)
{
    int res=n1+n2;
    printf("%d",res);
    return res;
}