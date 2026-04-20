// strong number 
#include<stdio.h>
int main()
{
    int start=1,end=200;
    for (int i = start; i <= end; i++)
    {
        int num =i,sum=0;
        while (num>0)
        {
            int fact=1;
            int rem = num%10;
            for (int j = 1; j <= rem; j++)
            {

                fact = fact*j;
            }
            sum=sum+fact;
            num = num/10;
        }
        if (i==sum)
        {
            printf("%d ",sum);
        }
    }
}