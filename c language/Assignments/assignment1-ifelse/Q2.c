//check 3 digit number is palindrom or not
#include<stdio.h>
int main()
{
    int num=125;
    int org = num; 
    int r1,r2,r3;
    r1 = num%10;
    num =num/10;
    r1 = r1*100;
    r2 = num%10;
    num = num/10;
    r2 = r2*10;
    r3 = num%10;
    num = num/10;
    int num1 = r1+r2+r3;

    if (num1==org)
    {
        printf("the number is palindrome");
    }
    else
    {
        printf("the number is not palindrome");
    }
}