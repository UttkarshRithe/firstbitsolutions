// PERFECT NUMBER
// w/o para and w/o return type

//#include<stdio.h>
//void perfect();
//int main()
//{
//    perfect();
//}
//void perfect()
//{
//    int n=28,i,sum=0;
//    for(i=1;i<n;i++)
//        if(n%i==0) sum+=i;
//    if(sum==n) printf("Perfect");
//    else printf("Not Perfect");
//}

// with para and w/o return type

//#include<stdio.h>
//void perfect(int);
//int main()
//{
//    perfect(28);
//}
//void perfect(int n)
//{
//    int i,sum=0;
//    for(i=1;i<n;i++)
//        if(n%i==0) sum+=i;
//    if(sum==n) printf("Perfect");
//    else printf("Not Perfect");
//}

// w/o para and with return type

//#include<stdio.h>
//int perfect();
//int main()
//{
//    if(perfect()) printf("Perfect");
//    else printf("Not Perfect");
//}
//int perfect()
//{
//    int n=28,i,sum=0;
//    for(i=1;i<n;i++)
//        if(n%i==0) sum+=i;
//    return sum==n;
//}

// with para and with return type

#include<stdio.h>
int perfect(int);
int main()
{
    if(perfect(28)) printf("Perfect");
    else printf("Not Perfect");
}
int perfect(int n)
{
    int i,sum=0;
    for(i=1;i<n;i++)
        if(n%i==0) sum+=i;
    return sum==n;
}

