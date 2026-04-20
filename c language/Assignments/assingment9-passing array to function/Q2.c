//search number in given array
#include<stdio.h>
int searchEle(int*,int);
int main()
{
    int size;
    printf("Enter size of array:");
    scanf("%d",size);
    int arr[size];
    searchEle(arr,size);
}
int searchEle(int* arr,int size)
{
    printf("Enter array ele:");
    for (int i = 0; i < size; i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("array elements are:");
    for (int i = 0; i < size; i++)
    {
        printf("%d",arr[i]);
    }
    int ele;
    printf("Enter ele you wnat to search:");
    scanf("%d",&ele);
    for (int i = 0; i < size; i++)
    {
        if (ele == arr[i])
        {
            return ele;
        }
    }
    
}
