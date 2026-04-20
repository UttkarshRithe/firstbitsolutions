#include<stdio.h>
#include<string.h>

int main()
{
    char name[]="Yash";
    int i=0,count=0;
    while (name[i]!='\0')
    {
        count++;
        i++;
    }
    printf("Length of string is: %d",count);
}