//strong number =145
//1! = 1
//4! = 24
//5! = 120
//1+24+120=145
#include<stdio.h>
int main()
{
    int num=225,rem,sum=0;
    int org = num;
    while (num>0)
    {
        int fact=1;
        rem = num%10;
        for (int i = 1; i <= rem; i++)
        {
            fact = fact*i;
        }
        sum = sum+fact;
        num = num/10;
    }
    if (org == sum )
    {
        printf("The number %d is strong number",org);
    }
    else
    {
        printf("The number %d is not strong number",org);
    }
}
