#include<stdio.h>
int main()
{
    int num, first, last;

    printf("Enter a number: ");
    scanf("%d", &num);

    last = num % 10;  

    first = num;
    while (first >= 10)
    {
        first = first / 10;
    }

    printf("Sum = %d", first + last);
    return 0;
}
