#include<stdio.h>
typedef struct Date
{
    int day;
    int month;
    int year;
}Student;
void setdata(Date*);
void getdata(Date*);

int main()
{
    Date d1;
    setdata(&d1);
    printf("\n");
    getdata(&d1);
}
void setdata(Date* d)
{
    printf("Enter Day: ");
    scanf("%d",&d->day);
    printf("Enter month: ");
    scanf("%d",&d->month);
    printf("Enter year: ");
    scanf("%d",&d->year);
}
void getdata(Student* d)
{
    printf("\t----info of student----\n");
    printf("day:%d month:%d year:%d",d->day,d->month,d->year);
}
