#include<stdio.h>
void main(){
    int no;
    printf("enter the number:");
    scanf("%d",&no);
    if(no%2==0){
        printf("number is even");
    }
    else{
        printf("number is odd");
    }
}