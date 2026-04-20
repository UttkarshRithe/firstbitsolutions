// reverse array
#include<stdio.h>
int main()
{
    int arr[]={1,2,3,4,5};
    int i = 0;
    int j = 4;

        while (i<j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    printf("Array reverse: ");
    for (int i = 0; i < 5; i++)
    {
        printf("%d",arr[i]);
    }
}