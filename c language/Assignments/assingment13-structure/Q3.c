#include<stdio.h>
typedef struct Admin
{
      int id;
      char name[10];
      int salary;
      double allowamce;

}Admin;
Admin setdata(Admin);
void getdata(Admin);
int main()
{
    Admin a1;
    a1= setdata(a1);
    getdata(a1);
}
Admin setdata(Admin adm)
{
    printf("Enter Admin id:");
    scanf("%d",&adm.id);
    printf("Enter Admin name:");
    scanf("%s",adm.name);
    printf("Enter salary of admin:");
    scanf("%d",&adm.salary);
    printf("Enter allowance of admin:");
    scanf("%lf",&adm.allowamce);
    return adm;
}

void getdata(Admin adm)
{
    printf("Admin id: %d\n",adm.id);
    printf("Admin name: %s\n",adm.name);
    printf("Admin salary: %d\n",adm.salary);
    printf("Admin allowance: %lf\n",adm.allowamce);
}