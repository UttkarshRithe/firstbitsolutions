//find sum of all numbers
#include<stdio.h>
int main()
{
    int size;
    printf("Enter size of array: ");
    scanf("%d",&size);
    int arr[10];
    printf("Array elements: ");
    for (int i = 0; i < size; i++)
    {
        scanf("%d",&arr[i]);
    }
    int sum=0;
    for (int i = 0; i < size; i++)
    {
        sum = sum+arr[i];
    }
    printf("sum of all elements is: %d",sum);
    
}