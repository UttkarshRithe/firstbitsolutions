#include<stdio.h>
int main()
{
    double basicsal=8000;
    if (basicsal<=5000)
    {
        double da = basicsal*10/100;
        double ta = basicsal*20/100;
        double hra = basicsal*25/100;
        double totalsal = basicsal+da+ta+hra;
        printf("Total salary is:%lf",totalsal);
    }
    else
    {
        double da = basicsal*15/100;
        double ta = basicsal*25/100;
        double hra = basicsal*30/100;
        double totalsal = basicsal+da+ta+hra;
        printf("Total salary is:%lf",totalsal);
    }
    
    
}