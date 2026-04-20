// TABLE OF NUMBER
// w/o para and w/o return type

//#include<stdio.h>
//void table();
//int main()
//{
//    table();
//}
//void table()
//{
//    int n=5,i;
//    for(i=1;i<=10;i++)
//        printf("%d ",n*i);
//}

// with para and w/o return type

#include<stdio.h>
void table(int);
int main()
{
    table(5);
}
void table(int n)
{
    int i;
    for(i=1;i<=10;i++)
        printf("%d ",n*i);
}


