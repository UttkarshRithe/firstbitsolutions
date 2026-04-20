#include<stdio.h>
int main()
{
    int num=9;
    if (num%3==0&&num%5==0)
    {
        printf("Number is divisible by both 3 and 5");
    }
    else
    {
        if (num%3==0)
        {
            printf("Number is divisible by 3 not 5");
        }
        else
        {
            printf("Number is divisible by 5 not 3 ");
        }   
    }
}