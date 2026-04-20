#include<stdio.h>

void findSum(int arr[], int n)
{
    int sum = 0;

    for(int i=0;i<n;i++)
        sum = sum + arr[i];

    printf("Sum = %d",sum);
}

int main()
{
    int arr[5] = {1,2,3,4,5};
    findSum(arr,5);
    return 0;
}

