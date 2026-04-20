// LEAP YEAR
// w/o para and w/o return type

//#include<stdio.h>
//void isLeap();
//int main()
//{
//    isLeap();
//}
//void isLeap()
//{
//    int year = 1900;
//    if((year%4==0 && year%100!=0) || year%400==0)
//        printf("Leap Year");
//    else
//        printf("Not a Leap Year");
//}

// with para and w/o return type

//#include<stdio.h>
//void isLeap(int);
//int main()
//{
//    int year = 1700;
//    isLeap(year);
//}
//void isLeap(int year)
//{
//    if((year%4==0 && year%100!=0) || year%400==0)
//        printf("Leap Year");
//    else
//        printf("Not a Leap Year");
//}

// w/o para and with return type

//#include<stdio.h>
//int isLeap();
//int main()
//{
//    int res = isLeap();
//    if(res == 1)
//        printf("Leap Year");
//    else
//        printf("Not a Leap Year");
//}
//int isLeap()
//{
//    int year = 2000;
//    if((year%4==0 && year%100!=0) || year%400==0)
//        return 1;
//    else
//        return 0;
//}

// with para and with return type

#include<stdio.h>
int isLeap(int);
int main()
{
    int year = 1900;
    int res = isLeap(year);
    if(res == 1)
        printf("Leap Year");
    else
        printf("Not a Leap Year");
}
int isLeap(int year)
{
    if((year%4==0 && year%100!=0) || year%400==0)
        return 1;
    else
        return 0;
}

