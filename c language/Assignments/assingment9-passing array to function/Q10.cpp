#include<stdio.h>

void sortArray(int arr[], int n)
{
    int temp;

    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(arr[i] > arr[j])
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    for(int i=0;i<n;i++)
        printf("%d ",arr[i]);
}

int main()
{
    int arr[5] = {5,3,1,4,2};
    sortArray(arr,5);
    return 0;
}

