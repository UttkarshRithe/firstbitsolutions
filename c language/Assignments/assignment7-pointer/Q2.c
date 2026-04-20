#include<stdio.h>
float area(float*);
int main()
{
    float radius=1.5;
    float res = area(&radius);
    printf("%lf",res);
}

float area(float* radius)
{
    float area = 3.14*(*radius)*(*radius);
    return area;
}