// SUM OF FIRST AND LAST DIGIT
// w/o para and w/o return type

//#include<stdio.h>
//void sum();
//int main()
//{
//    sum();
//}
//void sum()
//{
//    int n=12345,last=n%10;
//    while(n>=10) n/=10;
//    printf("%d",n+last);
//}

// with para and w/o return type

//#include<stdio.h>
//void sum(int);
//int main()
//{
//    sum(12345);
//}
//void sum(int n)
//{
//    int last=n%10;
//    while(n>=10) n/=10;
//    printf("%d",n+last);
//}

// w/o para and with return type

//#include<stdio.h>
//int sum();
//int main()
//{
//    printf("%d",sum());
//}
//int sum()
//{
//    int n=12345,last=n%10;
//    while(n>=10) n/=10;
//    return n+last;
//}

// with para and with return type

#include<stdio.h>
int sum(int);
int main()
{
    printf("%d",sum(12345));
}
int sum(int n)
{
    int last=n%10;
    while(n>=10) n/=10;
    return n+last;
}

