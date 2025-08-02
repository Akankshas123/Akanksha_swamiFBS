#include<stdio.h>
void perfect(int*);
void main(){
    int no=28;
    perfect(&no);
}
void perfect(int* no)
{
    int sum=0;
    int i=1;
    while(i<=*no/2)
    {
        if(*no%i==0){
            sum=sum+i;
        }
        i++;
    }
    if(sum==*no){
        printf("the number is perfect");
    }
    else{
        printf("the number is not perfect");
    }
}
