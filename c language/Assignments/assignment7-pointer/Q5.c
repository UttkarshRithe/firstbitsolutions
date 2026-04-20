#include<stdio.h>
void avg(int*,int*,int*,int*,int*);
int main()
{
    int a=1,b=2,c=3,d=4,e=5;
    avg(&a,&b,&c,&d,&e);
}
void avg(int*a,int*b,int*c,int*d,int*e)
{
    float avg = (*a+*b+*c+*d+*e)/5;
    printf("result:%lf",avg);
}