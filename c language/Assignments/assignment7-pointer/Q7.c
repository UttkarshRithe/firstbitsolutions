#include<stdio.h>
void perimeter(int*,int*);
int main()
{
    int length=10,width=10;
    perimeter(&length,&width);
}
void perimeter(int* len,int*wid)
{
    float perimeter;
    perimeter = 2*(*len+*wid);
    printf("perimeter of triangle:%lf",perimeter);
}