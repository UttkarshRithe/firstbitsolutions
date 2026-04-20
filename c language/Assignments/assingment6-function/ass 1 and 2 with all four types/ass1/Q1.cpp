// ADD TWO INTEGERS
// w/o para and w/o return type

//#include<stdio.h>
//void add();
//int main()
//{
//    add();
//}
//void add()
//{
//    int a=10,b=20;
//    printf("Sum = %d",a+b);
//}

// with para and w/o return type

//#include<stdio.h>
//void add(int,int);
//int main()
//{
//    int a=10,b=20;
//    add(a,b);
//}
//void add(int a,int b)
//{
//    printf("Sum = %d",a+b);
//}

// w/o para and with return type

//#include<stdio.h>
//int add();
//int main()
//{
//    int res = add();
//    printf("Sum = %d",res);
//}
//int add()
//{
//    int a=10,b=20;
//    return a+b;
//}

// with para and with return type

#include<stdio.h>
int add(int,int);
int main()
{
    int a=10,b=20;
    int res = add(a,b);
    printf("Sum = %d",res);
}
int add(int a,int b)
{
    return a+b;
}

