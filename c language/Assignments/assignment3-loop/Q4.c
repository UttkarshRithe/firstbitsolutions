//check given number is prime or not

#include<stdio.h>
int main()
{
    int i, num = 11;
    for (i = 2; i <= num; i++)
    {
        if (num%i==0)
        {
            break;
        }
    }
    if (i==num)
    {
        printf("Number %d is prime",num);
    }
    else
    {
        printf("Number %d is not prime",num);
    }
}