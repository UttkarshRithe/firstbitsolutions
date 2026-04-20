//total salary
//w/o para and w/o return type

//#include<stdio.h>
//void calcSalary();
//int main()
//{
//    calcSalary();
//}
//void calcSalary()
//{
//    float basic = 4500, da, ta, hra, total;
//    
//    if(basic <= 5000)
//    {
//        da = basic * 0.10;
//        ta = basic * 0.20;
//        hra = basic * 0.25;
//    }
//    else
//    {
//        da = basic * 0.15;
//        ta = basic * 0.25;
//        hra = basic * 0.30;
//    }
//    
//    total = basic + da + ta + hra;
//    printf("Total Salary = %.2f", total);
//}

//with para and w/o return type

//#include<stdio.h>
//void calcSalary(float);
//int main()
//{
//    float basic = 6000;
//    calcSalary(basic);
//}
//void calcSalary(float basic)
//{
//    float da, ta, hra, total;
//    
//    if(basic <= 5000)
//    {
//        da = basic * 0.10;
//        ta = basic * 0.20;
//        hra = basic * 0.25;
//    }
//    else
//    {
//        da = basic * 0.15;
//        ta = basic * 0.25;
//        hra = basic * 0.30;
//    }
//    
//    total = basic + da + ta + hra;
//    printf("Total Salary = %.2f", total);
//}

//w/o para and with return type

//#include<stdio.h>
//float calcSalary();
//int main()
//{
//    float total = calcSalary();
//    printf("Total Salary = %.2f", total);
//}
//float calcSalary()
//{
//    float basic = 4800, da, ta, hra, total;
//    
//    if(basic <= 5000)
//    {
//        da = basic * 0.10;
//        ta = basic * 0.20;
//        hra = basic * 0.25;
//    }
//    else
//    {
//        da = basic * 0.15;
//        ta = basic * 0.25;
//        hra = basic * 0.30;
//    }
//    
//    total = basic + da + ta + hra;
//    return total;
//}

//with para and with return type

#include<stdio.h>
float calcSalary(float);
int main()
{
    float basic = 7000;
    float total = calcSalary(basic);
    printf("Total Salary = %f", total);
}
float calcSalary(float basic)
{
    float da, ta, hra, total;
    
    if(basic <= 5000)
    {
        da = basic * 0.10;
        ta = basic * 0.20;
        hra = basic * 0.25;
    }
    else
    {
        da = basic * 0.15;
        ta = basic * 0.25;
        hra = basic * 0.30;
    }
    
    total = basic + da + ta + hra;
    return total;
}



