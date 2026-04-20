//find even and odd element from array
#include<stdio.h>
int main()
{
    
    int arr[10],size;
    printf( "Enter Array size:");
    scanf("%d",&size);

    printf("Enter array elements:");
    for (int i = 0; i < size; i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("Array eleemnts are:");
    for (int i = 0; i < size; i++)
    {
        printf("%d ",arr[i]);
    }
    printf("\n");
    printf("Even numbers are:");
    for (int i = 0; i < size; i++)
    {
        if (arr[i]%2==0)
        {
           printf("%d ",arr[i]); 
        }
    }
    printf("\n");
    printf("odd numbers are:");
    for (int i = 0; i < size; i++)
    {
        if (arr[i]%2!=0)
        {
           printf("%d ",arr[i]); 
        }
    }
}