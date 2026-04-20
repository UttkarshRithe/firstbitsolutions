#include<stdio.h>
typedef struct Time
{
    int hour;
    int min;
    int sec;
}Time;
Time setdata(Time);
void getdata(Time);
int main()
{
    Time t1;
    t1= setdata(t1);
    getdata(t1);
}
Time setdata(Time t)
{
    printf("Enter hour:");
    scanf("%d",&t.hour);
    printf("Enter min:");
    scanf("%d",&t.min);
    printf("Enter sec");
    scanf("%d",&t.sec);
    return t;
}
void getdata(Time t)
{
    printf("Hour:%d",t.hour);
    printf("Min:%d",t.min);
    printf("Sec:%d",t.sec);
}