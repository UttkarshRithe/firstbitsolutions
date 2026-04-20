//WAP to calculate total and percetage of 5 sub 

#include<stdio.h>
int main()
{
    int  a=50,b=55,c=65,d=75,e=95;
    int totalmarks = a+b+c+d+e;
    float percetage = (totalmarks/500.0)*100;
    printf("Total marks of 5 sub is:%d and percentage is: %f ",totalmarks,percetage);
}