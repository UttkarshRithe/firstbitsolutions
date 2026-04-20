//check number is amstrong or not
#include<stdio.h>
int main()
{
    int rem,sum=0,num=153;
    int org = num;
    while (num>0)
    {
        rem = num%10;
        num = num/10;
        sum = sum + rem*rem*rem;
    }
    if (org == sum)
    {
        printf("Number %d is armstrong",org);
    }
}