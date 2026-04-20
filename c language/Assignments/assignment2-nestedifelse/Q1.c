//accept two number and operator from user and perform desired operation
#include<stdio.h>
int main()
{
    int a=10,b=20;
    printf("Enter number:\n 1.addition\n2.substraction\n3.multiplication\n4.division\n ");
    int num;
    scanf("%d",&num);
    if (num==1)
    {
        printf("additon of two digit is: %d",a+b);
    }
    else
    {
        if (num == 2)
        {
            printf("Substraction of two number is:%d",a-b);
        }
        else
        {
            if (num  == 3)
            {
                printf("multiplication of digits:%d",a*b);
            }
            else
            {
                printf("Division if two numbers: %lf",a/b);
            }
            
            
        }
    }
}