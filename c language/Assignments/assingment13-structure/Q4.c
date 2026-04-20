#include<stdio.h>
typedef struct HR
{
    int id;
    char name[200];
    int salary;
    double commission;
}HR;
HR setdata(HR);
void getdata(HR);
int main()
{
    HR h1;
    setdata(h1);
    getdata(h1);
}
HR setdata(HR h)
{
    printf("Enter id of HR: ");
    scanf("%d",&h.id);
    printf("Enter name of HR:  ");
    scanf("%s",h.name);
    printf("Enter salary of HR: ");
    scanf("%d",&h.salary);
    printf("Enter commision of HR:");
    scanf("%lf",&h.commission);
    return h;
}
void getdata(HR h)
{
    printf("id of HR:%d\n",h.id);
    printf("name of HR:%s\n",h.name);
    printf("salary of HR:%d\n",h.salary);
    printf("Commision of HR:%lf",h.commission);
}