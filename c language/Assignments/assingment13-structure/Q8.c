#include<stdio.h>
typedef struct Distanec
{
    int feet;
    int inch;
}Distanec;
Distanec setdata(Distanec);
void getdat(Distanec);
int main()
{
    Distanec d1;
    d1 = setdata(d1);
    getdat(d1);
}
Distanec setdata(Distanec d)
{
    printf("Enter feet:");
    scanf("%d",&d.feet);
    printf("Enter inch:");
    scanf("%d",&d.inch);
    return d;
}
void getdata(Distanec d)
{
    printf("Feet:%d\n",d.feet);
    printf("inch:%d",d.inch);
}