#include<stdio.h>
int greatest();
void main()
{ 
   int x=greatest();
   if(x==1) 
   printf("a is greatest");
   else if(x==2)
   printf("b is greatest");
   else if (x==3)
   printf("c is greatest");
}

int greatest()
{
    int a,b,c;
    printf("enter the value of a,b &c:");
    scanf("%d%d%d",&a,&b,&c);
    if(a>b && a>c)
      return 1;
    else if(b>c &&  b>a)
       return 2;
    else if(c>a && c>b)
        return 3;
}