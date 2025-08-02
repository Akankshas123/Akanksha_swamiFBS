#include <stdio.h>
#include <string.h>
#include <ctype.h>  // for tolower()

int mycasestrcmp(char*, char*);

void main()
{
    char str1[20] = "Akanksha";
    char str2[20] = "akanksha";

    int result = mycasestrcmp(str1, str2);
    printf("%d",result);

}

int mycasestrcmp(char* str1, char* str2)
{
    int i = 0;
    while(str1[i] != '\0') 
        
    {
        if(tolower(str1[i]) != tolower(str2[i]))
            return tolower(str1[i]) - tolower(str2[i]);
        i++;
    }
}
