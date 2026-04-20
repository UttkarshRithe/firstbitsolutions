#include<stdio.h>
typedef struct Admin
{
        int id;
        char name[20];
        int salary;
        int allowance;

}Admin;
void setdata(Admin*);
void getdata(Admin*);
int main()
{
    Admin a1;
    setdata(&a1);
    getdata(&a1);
}

void setdata(Admin *ad)
{
    printf("Enter id:");
    scanf("%d",&ad->id);
    printf("Enter name:");
    scanf("%s",ad->name);
    printf("Enter salary:");
    scanf("%d",&ad->salary);
    printf("Enter commission:");
    scanf("%d",&ad->allowance);
}
void getdata(Admin* ad)
{
    printf("id:%d\n",ad->id);
    printf("name:%s\n",ad->name);
    printf("salary:%d\n",ad->salary);
    printf("commission:%d\n",ad->allowance);
}
