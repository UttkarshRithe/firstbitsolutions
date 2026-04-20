#include<stdio.h>

void mergeArray(int a[], int b[], int c[], int n)
{
    int k = 0;

    for(int i=0;i<n;i++)
        c[k++] = a[i];

    for(int i=0;i<n;i++)
        c[k++] = b[i];

    for(int i=0;i<2*n;i++)
        printf("%d ",c[i]);
}

int main()
{
    int a[3] = {1,2,3};
    int b[3] = {4,5,6};
    int c[6];

    mergeArray(a,b,c,3);
    return 0;
}

