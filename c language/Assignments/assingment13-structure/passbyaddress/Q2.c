#include<stdio.h>
typedef struct Employee
{
        int id;
        char name[20];
        int salary;
}Employee;
void setdata(Employee*);
void getdata(Employee*);
int main()
{
    Employee e1;
    setdata(&e1);
    getdata(&e1);
}
void setdata(Employee* e)
{
    printf("enter id employee: ");
    scanf("%d",&e->id);
    printf("Enter name of employee: ");
    scanf("%s",e->name);
    printf("Enter salary of employee: " );
    scanf("%d",&e->salary);
}
void getdata(Employee* e)
{
    printf("\t===info of employee---\n");
    printf("id:%d name:%s salary:%d",e->id,e->name,e->salary);
}
