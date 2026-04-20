// TOTAL AND PERCENTAGE
// w/o para and w/o return type

//#include<stdio.h>
//void result();
//int main()
//{
//    result();
//}
//void result()
//{
//    int a=80,b=70,c=90,d=85,e=75;
//    int total=a+b+c+d+e;
//    printf("Total=%d Percentage=%.2f",total,total/5.0);
//}

// with para and w/o return type

//#include<stdio.h>
//void result(int,int,int,int,int);
//int main()
//{
//    result(80,70,90,85,75);
//}
//void result(int a,int b,int c,int d,int e)
//{
//    int total=a+b+c+d+e;
//    printf("Total=%d Percentage=%.2f",total,total/5.0);
//}

// w/o para and with return type

//#include<stdio.h>
//int result();
//int main()
//{
//    printf("Total=%d",result());
//}
//int result()
//{
//    return 80+70+90+85+75;
//}

// with para and with return type

#include<stdio.h>
int result(int,int,int,int,int);
int main()
{
    int total = result(80,70,90,85,75);
    printf("Total=%d Percentage=%.2f",total,total/5.0);
}
int result(int a,int b,int c,int d,int e)
{
    return a+b+c+d+e;
}

