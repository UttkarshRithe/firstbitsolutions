// ARMSTRONG NUMBER
// w/o para and w/o return type

//#include<stdio.h>
//void arm();
//int main()
//{
//    arm();
//}
//void arm()
//{
//    int n=153,temp,sum=0,rem;
//    temp=n;
//    while(n>0)
//    {
//        rem=n%10;
//        sum+=rem*rem*rem;
//        n/=10;
//    }
//    if(sum==temp) printf("Armstrong");
//    else printf("Not Armstrong");
//}

// with para and w/o return type

//#include<stdio.h>
//void arm(int);
//int main()
//{
//    arm(153);
//}
//void arm(int n)
//{
//    int temp=n,sum=0,rem;
//    while(n>0)
//    {
//        rem=n%10;
//        sum+=rem*rem*rem;
//        n/=10;
//    }
//    if(sum==temp) printf("Armstrong");
//    else printf("Not Armstrong");
//}

// w/o para and with return type

//#include<stdio.h>
//int arm();
//int main()
//{
//    if(arm()) printf("Armstrong");
//    else printf("Not Armstrong");
//}
//int arm()
//{
//    int n=153,temp=n,sum=0,rem;
//    while(n>0)
//    {
//        rem=n%10;
//        sum+=rem*rem*rem;
//        n/=10;
//    }
//    return sum==temp;
//}

// with para and with return type

#include<stdio.h>
int arm(int);
int main()
{
    if(arm(153)) printf("Armstrong");
    else printf("Not Armstrong");
}
int arm(int n)
{
    int temp=n,sum=0,rem;
    while(n>0)
    {
        rem=n%10;
        sum+=rem*rem*rem;
        n/=10;
    }
    return sum==temp;
}

