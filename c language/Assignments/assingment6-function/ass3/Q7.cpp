// FACTORIAL
// w/o para and w/o return type

//#include<stdio.h>
//void fact();
//int main()
//{
//    fact();
//}
//void fact()
//{
//    int n=5,i,f=1;
//    for(i=1;i<=n;i++) f*=i;
//    printf("%d",f);
//}

// with para and w/o return type

//#include<stdio.h>
//void fact(int);
//int main()
//{
//    fact(5);
//}
//void fact(int n)
//{
//    int i,f=1;
//    for(i=1;i<=n;i++) f*=i;
//    printf("%d",f);
//}

// w/o para and with return type

//#include<stdio.h>
//int fact();
//int main()
//{
//    printf("%d",fact());
//}
//int fact()
//{
//    int n=5,i,f=1;
//    for(i=1;i<=n;i++) f*=i;
//    return f;
//}

// with para and with return type

#include<stdio.h>
int fact(int);
int main()
{
    printf("%d",fact(5));
}
int fact(int n)
{
    int i,f=1;
    for(i=1;i<=n;i++) f*=i;
    return f;
}

