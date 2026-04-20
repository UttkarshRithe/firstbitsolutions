#include<stdio.h>
int main()
{
    int marks = 8;
    if (marks>=75)
    {
        printf("Distinction");
    }
    else
    {
        if (marks>=65)
        {
            printf("First Class");
        }
        else
        {
            if (marks>=55)
            {
                printf("second class");
            }
            else
            {
                if (marks>=40)
                {
                    printf("Pass Class");
                }
                else
                {
                    printf("Fail");
                }   
            }   
        }   
    }
}