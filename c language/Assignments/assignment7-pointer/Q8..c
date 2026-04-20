#include<stdio.h>
void evenodd(int*);
int main()
{
    int num=2;
    evenodd(&num);
}
void evenodd(int*num)
{
    if (*num%2==0)
    {
        printf("Even number");
    }
    else
    {
        printf("odd number");
    }
}