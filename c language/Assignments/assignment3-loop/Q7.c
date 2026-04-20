//factorial
#include<stdio.h>
int main()
{
    int num = 5,fact=1;
    for (int i = 1; i <= num; i++)
    {
        fact = fact*i;
    }
    printf("Factorial of number %d is: %d ",num,fact);
}