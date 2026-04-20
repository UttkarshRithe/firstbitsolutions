#include<stdio.h>
#include<string.h>

typedef struct employee
{
    int eid;
    char ename[20];
    int salary;
}employee;

struct employee setdata(struct employee);
void getdata(employee);

int main()
{
    
   struct employee e1,e2;
    e1 = setdata(e1);
    getdata(e1);
    printf("\n");
    e2 = setdata(e2);
    getdata(e2);
}
struct employee setdata(struct employee emp)
{

    printf("Enter eid:");
    scanf("%d",&emp.eid);
    printf("Enter ename:");
    scanf("%s",emp.ename);
    printf("enter salary: ");
    scanf("%d",&emp.salary);
    return emp;
}
void getdata(employee emp)
{
    printf("\t ----Employee info of employee:%d",emp.eid);
    printf("\neid of employee: %d",emp.eid);
    printf("\nename of employee: %s",emp.ename);
    printf("\nsalary of employee: %d",emp.salary);
}