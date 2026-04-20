#include<stdio.h>
typedef struct SalesManager
{
    int id;
    char name[20];
    int salary;
    int incentive;
    int target;
}SalesManager;
void setdata(SalesManager*);
void getdata(SalesManager*);
int main()
{
    SalesManager s1;
    setdata(&s1);
    getdata(&s1);
}

void setdata(SalesManager *SM)
{
    printf("Enter id:");
    scanf("%d",&SM->id);
    printf("Enter name:");
    scanf("%s",&SM->name);
    printf("Enter salary:");
    scanf("%d",&SM->salary);
    printf("Enter incentive:");
    scanf("%d",&SM->incentive);
    printf("Enter targer:");
    scanf("%d",&SM->target);

}
void getdata(SalesManager* sm)
{
    printf("id:%d name:%s salary:%d incentive:%d target%d",sm->id,sm->name,sm->salary,sm->incentive,sm->target);
}