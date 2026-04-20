// STRONG NUMBER
// w/o para and w/o return type

//#include<stdio.h>
//void strong();
//int main()
//{
//    strong();
//}
//void strong()
//{
//    int n=145,temp=n,sum=0,rem,i,f;
//    while(n>0)
//    {
//        rem=n%10;
//        f=1;
//        for(i=1;i<=rem;i++) f*=i;
//        sum+=f;
//        n/=10;
//    }
//    if(sum==temp) printf("Strong");
//    else printf("Not Strong");
//}

// with para and w/o return type

//#include<stdio.h>
//void strong(int);
//int main()
//{
//    strong(145);
//}
//void strong(int n)
//{
//    int temp=n,sum=0,rem,i,f;
//    while(n>0)
//    {
//        rem=n%10;
//        f=1;
//        for(i=1;i<=rem;i++) f*=i;
//        sum+=f;
//        n/=10;
//    }
//    if(sum==temp) printf("Strong");
//    else printf("Not Strong");
//}

// w/o para and with return type

//#include<stdio.h>
//int strong();
//int main()
//{
//    if(strong()) printf("Strong");
//    else printf("Not Strong");
//}
//int strong()
//{
//    int n=145,temp=n,sum=0,rem,i,f;
//    while(n>0)
//    {
//        rem=n%10;
//        f=1;
//        for(i=1;i<=rem;i++) f*=i;
//        sum+=f;
//        n/=10;
//    }
//    return sum==temp;
//}

// with para and with return type

#include<stdio.h>
int strong(int);
int main()
{
    if(strong(145)) printf("Strong");
    else printf("Not Strong");
}
int strong(int n)
{
    int temp=n,sum=0,rem,i,f;
    while(n>0)
    {
        rem=n%10;
        f=1;
        for(i=1;i<=rem;i++) f*=i;
        sum+=f;
        n/=10;
    }
    return sum==temp;
}

