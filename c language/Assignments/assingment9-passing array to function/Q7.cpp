#include<stdio.h>

void addArray(int a[], int b[], int c[], int n)
{
    for(int i=0;i<n;i++)
        c[i] = a[i] + b[i];

    for(int i=0;i<n;i++)
        printf("%d ",c[i]);
}

int main()
{
    int a[5] = {1,2,3,4,5};
    int b[5] = {10,20,30,40,50};
    int c[5];

    addArray(a,b,c,5);
    return 0;
}

