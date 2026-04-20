#include<stdio.h>
typedef struct SaleManager
{
    int id;
    char name[20];
    int salary;
    double incentive;
    int target;
}SM;
SM setdata(SM);
void getdata(SM);
int main()
{
    SM s1;
    s1 = setdata(s1);
    getdata(s1);

}
SM setdata(SM s)
{
    printf("Enter id of SalesManager:");
    scanf("%d",&s.id);
    printf("ENter name of SalesManager: ");
    scanf("%s",s.name);
    printf("Enter salary of SalesManager:");
    scanf("%d",&s.salary);
    printf("EMter incemtive of SalesManager: ");
    scanf("%lf",&s.incentive);
    printf("Enter target for SalesManager: ");
    scanf("%d",&s.target);
    return s;
}
void getdata(SM s)
{
    printf("id of SalesManager:%d\n",s.id);
    printf("name of SalesManager:%s\n",s.name);
    printf("salary of SalesManager:%d\n",s.salary);
    printf("incentive of SalesManager:%lf\n",s.incentive);
    printf("Target of SalesManager:%d\n",s.target);
}