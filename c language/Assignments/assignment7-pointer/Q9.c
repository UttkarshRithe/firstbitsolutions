#include<stdio.h>
void isPal(int*);
int main()
{
    int no =121;
    isPal(&no);
}
void isPal(int* no)
{
    int rev=0,rem;
    int org = *no;
    while (*no)
    {
        rem = *no%10;
        rev = rev*10+rem;
        *no = *no/10;
    }
    if (org == rev)
    {
        printf("Number is palindrome");
    }
    else
    {
        printf("NUmber is not palindrome");
    }   
}