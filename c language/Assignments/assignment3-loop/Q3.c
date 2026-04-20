//sum of number in given range
#include<stdio.h>
int main()
{
    int start =1,end=5;
    int sum =0;
    for (int i = start; i <= end; i++)
    {
        sum = sum+i;
    }
    printf("%d",sum);
    
}