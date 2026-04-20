// Palindrome or Not
#include <stdio.h>

int main()
{
    int num = 1221;
    int original = num;
    int rev = 0, rem;

    while (num > 0)
    {
        rem = num % 10;
        rev = rev * 10 + rem;
        num = num / 10;
    }

    if (rev == original)
    {
        printf("The given number %d is a palindrome", original);
    }
    else
    {
        printf("The given number %d is not a palindrome", original);
    }

    return 0;
}
