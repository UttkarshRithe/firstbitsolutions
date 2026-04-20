#include<stdio.h>
typedef struct Distanec
{
    int feet;
    int inch;
}Distanec;
void setdata(Distanec*);
void getdata(Distanec*);
int main()
{
    Distanec d1;
    setdata(&d1);
    getdata(&d1);
}
void setdata(Distanec* d)
{
    printf("Enter feet:");
    scanf("%d",&d->feet);
    printf("Enter inch:");
    scanf("%d",&d->inch);
}
void getdata(Distanec* d)
{
    printf("Feet:%d\n",d->feet);
    printf("inch:%d",d->inch);
}
