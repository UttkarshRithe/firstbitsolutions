// PALINDROME NUMBER
// w/o para and w/o return type

//#include<stdio.h>
//void pal();
//int main()
//{
//    pal();
//}
//void pal()
//{
//    int n=121,temp=n,rev=0,rem;
//    while(n>0)
//    {
//        rem=n%10;
//        rev=rev*10+rem;
//        n/=10;
//    }
//    if(rev==temp) printf("Palindrome");
//    else printf("Not Palindrome");
//}

// with para and w/o return type

//#include<stdio.h>
//void pal(int);
//int main()
//{
//    pal(121);
//}
//void pal(int n)
//{
//    int temp=n,rev=0,rem;
//    while(n>0)
//    {
//        rem=n%10;
//        rev=rev*10+rem;
//        n/=10;
//    }
//    if(rev==temp) printf("Palindrome");
//    else printf("Not Palindrome");
//}

// w/o para and with return type

//#include<stdio.h>
//int pal();
//int main()
//{
//    if(pal()) printf("Palindrome");
//    else printf("Not Palindrome");
//}
//int pal()
//{
//    int n=121,temp=n,rev=0,rem;
//    while(n>0)
//    {
//        rem=n%10;
//        rev=rev*10+rem;
//        n/=10;
//    }
//    return rev==temp;
//}

// with para and with return type

#include<stdio.h>
int pal(int);
int main()
{
    if(pal(121)) 
		printf("Palindrome");
    else 
		printf("Not Palindrome");
}
int pal(int n)
{
    int temp=n,rev=0,rem;
    while(n>0)
    {
        rem=n%10;
        rev=rev*10+rem;
        n/=10;
    }
    return rev==temp;
}

