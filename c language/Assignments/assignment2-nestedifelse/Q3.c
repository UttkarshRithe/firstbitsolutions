//greatest among three
#include<stdio.h>
int main()
{
    int a=10,b=20,c=3;
    if (a>b)
    {
        if (a>c)
        {
            printf("a is greater");
        }
        else
        {
            printf("c is greater");
        }
    }
    else
    {
        if (b>c)
        {
            printf("b is greater");
        }
        else
        {
            printf("c is greater");
        }
    }
}