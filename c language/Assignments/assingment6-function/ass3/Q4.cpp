// PRIME NUMBER
// w/o para and w/o return type

//#include<stdio.h>
//void prime();
//int main()
//{
//    prime();
//}
//void prime()
//{
//    int n=7,i,flag=0;
//    for(i=2;i<n;i++)
//        if(n%i==0) flag=1;
//    if(flag==0) printf("Prime");
//    else printf("Not Prime");
//}

// with para and w/o return type

//#include<stdio.h>
//void prime(int);
//int main()
//{
//    prime(7);
//}
//void prime(int n)
//{
//    int i,flag=0;
//    for(i=2;i<n;i++)
//        if(n%i==0) flag=1;
//    if(flag==0) printf("Prime");
//    else printf("Not Prime");
//}

// w/o para and with return type

//#include<stdio.h>
//int prime();
//int main()
//{
//    if(prime()) printf("Prime");
//    else printf("Not Prime");
//}
//int prime()
//{
//    int n=7,i;
//    for(i=2;i<n;i++)
//        if(n%i==0) return 0;
//    return 1;
//}

// with para and with return type

#include<stdio.h>
int prime(int);
int main()
{
    if(prime(7)) 
		printf("Prime");
    else
		printf("Not Prime");
}
int prime(int n)
{
    int i;
    for(i=2;i<n;i++)
        if(n%i==0) 
			return 0;
    return 1;
}

