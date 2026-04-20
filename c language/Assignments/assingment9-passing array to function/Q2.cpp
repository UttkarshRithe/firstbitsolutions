#include<stdio.h>

void searchElement(int arr[], int n, int key)
{
    int found = 0;

    for(int i=0;i<n;i++)
    {
        if(arr[i] == key)
            found = 1;
    }

    if(found == 1)
        printf("Element Found");
    else
        printf("Element Not Found");
}

int main()
{
    int arr[5] = {10,20,30,40,50};
    searchElement(arr,5,30);
    return 0;
}

