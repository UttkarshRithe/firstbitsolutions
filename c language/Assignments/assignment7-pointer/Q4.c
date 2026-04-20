#include<stdio.h>
void swap(int*,int*);
int main()
{
    int a=1,b=2;
    swap(&a,&b);
}
void swap(int *a,int *b)
{
    int temp = *a;
    *a = *b;
    *b=temp;
    printf("a:%d b:%d",*a,*b);
}