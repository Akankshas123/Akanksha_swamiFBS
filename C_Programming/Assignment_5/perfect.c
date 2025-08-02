#include<stdio.h>
int perfect(int);
void main(){
    int no;
    printf("enter a number");
    scanf("%d",&no);
    int x=perfect(no);
    if(x==1)
    printf("perfect");
    else
    printf("not perfect");
}
int perfect(int no)
{
    int sum=0;
    int i=1;
    while(i<=no/2)
    {
        if(no%i==0){
            sum=sum+i;
        }
        i++;
    }
    if(sum==no)
      return 1;
    else
      return 0;
}
