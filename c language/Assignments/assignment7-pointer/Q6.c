#include<stdio.h>
void min(int*);
int main()
{
    int m=130;
    min(&m);
}
void min(int* m)
{
    int hour = *m/60;
    int min = *m%60;
    printf("hour:%d,min:%d",hour,min); 
}
