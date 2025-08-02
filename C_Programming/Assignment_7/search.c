#include<stdio.h>
void main()
{
    int arr[5],num;
    int index;
    for(int i=0;i<5;i++){
    printf("enter the %d elements:",i);
    scanf("%d",&arr[i]);
   }

printf("enter the number");
scanf("%d",&num);
int flag=0;
for(int i=0;i<5;i++){
    if(num==arr[i])
    {
        index=i;
        printf("%d number found at %d position",num,index);
        flag=1;
        break;
    } 
 }
if(flag==0)
        printf("not found");
    
}