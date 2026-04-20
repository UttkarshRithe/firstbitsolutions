//print armstrong number between rnge
#include<stdio.h>
#include<math.h>
int main()
{
    int start = 1,end=500;
    for (int i = 1; i <= end; i++)
    {
        int arm=0,rem,num=i; 
        while (num>0)
        {
            rem = num%10;
            arm =arm + pow(rem,3);
            num=num/10;
        }
        if (i==arm)
        {
            printf("%d ",i);
        }    
    }   
}