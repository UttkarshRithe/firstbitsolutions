#include<stdio.h>
int main()
{
    printf("Your Student or Not: Enter y is yes or n for no: ");
    char ch;
    scanf("%c",&ch);
    if (ch == 'y')
    {
        printf("Now your student,Enter Purchase value: ");
        double purchase;
        scanf("%lf",&purchase);
        if (purchase>=500)
        {
            double fpurchase = purchase*20/100 ;
            printf("Final Purchase value with 20 dicount: %lf",purchase-fpurchase);
        }
        else
        {
            double fpurchase = purchase*10/100;
            printf("Final Purchase value with 10 dicount: %lf",purchase-fpurchase);
        }
    }
    else
    {
        printf("Now your not student,Enter Purchase value: ");
        double purchase;
        scanf("%lf",&purchase);
        if (purchase>=600)
        {
            double fpurchase = purchase*15/100 ;
            printf("Final Purchase value with 15 dicount: %lf",purchase-fpurchase);
        }
        else
        {
            printf("Final Purchase value with 0 dicount: %lf",purchase);
        }
    }
}