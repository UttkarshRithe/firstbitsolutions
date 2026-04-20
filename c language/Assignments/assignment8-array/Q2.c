//search element in array
#include<stdio.h>
int main()
{
    int n;
    printf("Enter size of array:");
    scanf("%d",&n);
    int arr[10];
    for (int i = 0; i < n; i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("Elements in array: ");
    for (int i = 0; i < n; i++)
    {
        printf("%d",arr[i]);
    }
    printf("\n");
    int num;
    printf("Enter a number you want to search in array: ");
    scanf("%d",&num);
    for (int i = 0; i < n; i++)
    {
        if (num==arr[i])
        {
            printf("Element found: %d",num);
            break;
        }
        else
        {
            printf("Element not found");
        }
        
    }
}