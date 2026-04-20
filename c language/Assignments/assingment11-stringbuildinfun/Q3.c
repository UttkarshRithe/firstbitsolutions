#include<stdio.h>
#include<string.h>
int main()
{
    char str1[]="Yash";
    char str2[]="";
    strncpy(str2,str1,3);
    printf("%s",str2);
}