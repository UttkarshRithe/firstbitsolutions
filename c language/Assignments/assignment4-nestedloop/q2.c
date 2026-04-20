#include<stdio.h>
int main()
{
    int start=1,end=100,i,j;
    for ( i = start; i <= end; i++)
    {
        int num =i;
        for ( j = 2; j < num ; j++)
        {
            if (num%j == 0)
            {
                break;
            }
            
        }
        if (num == j)
        {
            printf("%d ",num);
        }  
    }
    
}