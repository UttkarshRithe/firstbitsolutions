#include<stdio.h>

void printOddEven(int arr[], int n)
{
    printf("Even Numbers:\n");
    for(int i=0;i<n;i++)
    {
        if(arr[i] % 2 == 0)
            printf("%d ",arr[i]);
    }

    printf("\nOdd Numbers:\n");
    for(int i=0;i<n;i++)
    {
        if(arr[i] % 2 != 0)
            printf("%d ",arr[i]);
    }
}

int main()
{
    int arr[5] = {1,2,3,4,5};
    printOddEven(arr,5);
    return 0;
}

