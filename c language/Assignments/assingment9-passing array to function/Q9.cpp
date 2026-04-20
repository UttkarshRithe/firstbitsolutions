#include<stdio.h>

void reverseArray(int arr[], int n)
{
    int i = 0;
    int j = n - 1;
    int temp;

    while(i < j)
    {
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
    }
}

int main()
{
    int arr[5] = {1,2,3,4,5};

    reverseArray(arr,5);

    for(int i=0;i<5;i++)
        printf("%d ",arr[i]);

    return 0;
}

