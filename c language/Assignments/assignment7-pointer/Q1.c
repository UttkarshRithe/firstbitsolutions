#include<stdio.h>
int add(int*,int*);
int main()
{
    int a=1,b=2;
    int sum= add(&a,&b);
    printf("sum is: %d",sum);
}
int add(int* a,int* b)
{
    int sum=*a+*b;
    return sum;
}