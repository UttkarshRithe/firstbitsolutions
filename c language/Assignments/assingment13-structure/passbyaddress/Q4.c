#include<stdio.h>
typedef struct HR
{
    int id;
    char name[20];
    int salary;
    int commission;
}HR;
void setdata(HR*);
void getdata(HR*);
int main()
{
    HR h1;
    setdata(&h1);
    getdata(&h1);
}

void setdata(HR* hr)
{
    printf("ENter id:");
    scanf("%d",&hr->id);
    printf("Enter name:");
    scanf("%s",hr->name);
    printf("Enter salary:");
    scanf("%d",&hr->salary);
    printf("Enter commission:");
    scanf("%d",&hr->commission);
}
void getdata(HR* hr)
{
    printf("id:%d name:%s salary:%d commission:%d",hr->id,hr->name,hr->salary,hr->commission);
}