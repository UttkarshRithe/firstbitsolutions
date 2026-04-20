//convert given minutes in hr and remaining minutes
#include<stdio.h>
int main()
{
    int minutes = 70;
    int hrs = minutes/60;
    int rmin = minutes%60;
    printf("conversion of minutes %d into hrs is: %d and remaining minutes is: %d ",minutes,hrs,rmin);
}