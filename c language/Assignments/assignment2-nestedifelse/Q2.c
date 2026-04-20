//accept 3 sides of triangle and decide wether it is equilatral,isosceles,scalen
#include<stdio.h>
int main()
{
    int a=2,b=20,c=20;
    if (a==b && b==c && c==a)
    {
        printf("triangle is Equilateral");
    }else
    {
        if (a!=b&&b!=c&&a!=c)
        {
            printf("Triangle is scalen");
        }
        else
        {
            printf("Triangle is isosceles");
        }
        
    }
}