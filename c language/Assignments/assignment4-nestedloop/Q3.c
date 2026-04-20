//perfect number bet range
#include<stdio.h>
int main()
{
    int start=1,end=100;
    for (int i = start; i < end ; i++)
    {
        int num=i,sum=0;
        for (int j = 1; j < num ; j++)
        {
            if (num%j==0)
            {
                sum=sum+j;
            }
            
        }
        if (sum==num)
        {
            printf("%d ",num);
        }
    }
}