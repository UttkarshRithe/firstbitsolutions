#include<stdio.h>
typedef struct Date
{
    int day;
    int month;
    int year;
}Date;
Date setdata(Date);
void getdata(Date);
int main()
{
    Date d1;
    d1=setdata(d1);
    getdata(d1);
}
Date setdata(Date d)
{
    printf("Enter day:");
    scanf("%d",&d.day);
    printf("Enter month: ");
    scanf("%d",&d.month);
    printf("Enter year:");
    scanf("%d",&d.year);
    return d;
}
void getdata(Date d)
{
    printf("day:%d month:%d year:%d",d.day,d.month,d.year);
}
