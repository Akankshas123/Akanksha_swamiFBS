#include<stdio.h>
int palindrome(int);
void main()
{
  int no;
  printf("enter a three digit number:\n");
  scanf("%d",&no);
    
  int x=palindrome(no);
  if(x==1)
  printf("palindrome");
  else
  printf("not palindrome");
}
int palindrome(int no)
{
    int r1,r2,r3,q1,rev;
    
    r1=no%10;
    q1=no/10;
    r2=q1%10;
    r3=q1/10;

    rev=r1*100+r2*10+r3;

    if(no==rev)
       return 1;
    else
       return 0; 
}