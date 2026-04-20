//print alternate numbers in array

#include<stdio.h>
int main()
{
    int size;
    printf("Enter size of array:");
    scanf("%d",&size);
    int arr[size];
    printf("Enter array element:");
    for (int i = 0; i < size; i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("Alternet elements are: ");
    for (int i = 0; i < size; i=i+2)
    {
        printf("%d ",arr[i]);
    }
    
    
}