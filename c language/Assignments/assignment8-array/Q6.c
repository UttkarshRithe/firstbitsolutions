#include<stdio.h>
int main()
{
    printf("Enter array size: ");
    int size;
    scanf("%d",&size);
    printf("Enter array elements: ");
    int arr[size];
    for (int i = 0; i < size; i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("prime numbers from array: ");
    int j;
    for (int i = 0; i < size; i++)
    {
       for ( j = 2; j < arr[i]; j++)
       {
            if (arr[i]%2==0)
            {
                break;
            }
       }
       if (arr[i]==j)
       {
        printf("%d ",arr[i]);
       }
    }
}