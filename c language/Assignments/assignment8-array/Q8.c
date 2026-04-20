//merge two array
#include<stdio.h>
int main()
{
    int arr1[5]={1,2,3,4,5};
    int arr2[5]={10,20,30,40,50};
    int arr3[10];
    for (int i = 0; i < 5; i++)
    {
        arr3[i]=arr1[i];
    }
    for (int i = 0; i <=10  ; i++)
    {
        arr3[i+5]=arr2[i];
    }
    printf("Merge array is: ");
    for (int i = 0; i < 10; i++)
    {
        printf("%d ",arr3[i]);
    }
}