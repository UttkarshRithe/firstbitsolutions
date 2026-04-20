// PRINT 1 TO 10
// w/o para and w/o return type

//#include<stdio.h>
//void print();
//int main()
//{
//    print();
//}
//void print()
//{
//    int i;
//    for(i=1;i<=10;i++)
//        printf("%d ",i);
//}

// with para and w/o return type

#include<stdio.h>
void print(int);
int main()
{
    print(10);
}
void print(int n)
{
    int i;
    for(i=1;i<=n;i++)
        printf("%d ",i);
}

