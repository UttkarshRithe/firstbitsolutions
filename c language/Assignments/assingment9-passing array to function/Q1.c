#include<stdio.h>
int max(int*,int);
int min(int*,int);
int main()
{
    int size;
    printf("ENter size of array:");
    scanf("%d",&size);
    int arr[size];
    int res = max(arr,size);
    printf("max number from array: %d",res);
    int res2= min(arr,size);
    printf("min number from array: %d",res2);
    
}

int max(int* arr,int size)
{
    printf("Enter array elements: ");
    for (int i = 0; i < size; i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("Array elements are: ");
    for (int i = 0; i < size; i++)
    {
        printf("%d ",arr[i]);
    }
    int max = arr[0];
    for (int i = 1; i < size; i++)
    {
        if (arr[i]>max)
        {
            max = arr[i];
        }
    }
    
    return max;
}
int min(int* arr,int size)
{
    printf("Enter array elements: ");
    for (int i = 0; i < size; i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("Array elements are: ");
    for (int i = 0; i < size; i++)
    {
        printf("%d ",arr[i]);
    }
    int min = arr[0];
    for (int i = 1; i < size; i++)
    {
        if (arr[i]<min)
        {
            min = arr[i];
        }
    }
    
    return min;
}