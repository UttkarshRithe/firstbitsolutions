#include<stdio.h>
int main()
{
    int num = 18,sum=0;
    for (int i = 1; i < num; i++)
    {
        if (num%i==0)
        {
            sum = sum+i;
        }
    }
    if (sum == num)
    {
        printf("Number %d is perfect number",num);
    }
    else
    {
        printf("Number %d is not perfect number",num);
    }
    
}