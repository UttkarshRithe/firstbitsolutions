#include<stdio.h>
int main()
{
    printf("Enter array size: ");
    int size;
    scanf("%d",&size);
    int arr1[size];
    int arr2[size];
    printf("Enter array1 elements: ");
    for (int i = 0; i < size; i++)
    {
        scanf("%d",&arr1[i]);
    }
    printf("Enter array2 elements: ");
    for (int i = 0; i < size; i++)
    {
        scanf("%d",&arr2[i]);
    }
    int arr3[size];
    printf("Addition of two array in third array is:");
    for (int i = 0; i < size; i++)
    {
        arr3[i]=arr1[i]+arr2[i];
    }
    for (int i = 0; i < size; i++)
    {
        printf("%d ",arr3[i]);
    }
}