#include<stdio.h>
typedef struct Time
{
    int hour;
    int min;
    int sec;
}Time;
void setdata(Time*);
void getdata(Time*);

int main()
{
    Time s1;
    setdata(&s1);
    printf("\n");
    getdata(&s1);
}
void setdata(Time* s)
{
    printf("Enter hour: ");
    scanf("%d",&s->hour);
    printf("Enter min: ");
    scanf("%d",&s->min);
    printf("Enter sec: ");
    scanf("%d",&s->sec);
}
void getdata(Time* s)
{
    printf("\t----info of student----\n");
    printf("hour:%d min:%d sec:%d",s->hour,s->min,s->sec);
}
