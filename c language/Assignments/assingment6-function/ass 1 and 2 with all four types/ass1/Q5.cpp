// AVERAGE OF FIVE NUMBERS
// w/o para and w/o return type

//#include<stdio.h>
//void avg();
//int main()
//{
//    avg();
//}
//void avg()
//{
//    int a=10,b=20,c=30,d=40,e=50;
//    printf("Avg = %.2f",(a+b+c+d+e)/5.0);
//}

// with para and w/o return type

//#include<stdio.h>
//void avg(int,int,int,int,int);
//int main()
//{
//    avg(10,20,30,40,50);
//}
//void avg(int a,int b,int c,int d,int e)
//{
//    printf("Avg = %.2f",(a+b+c+d+e)/5.0);
//}

// w/o para and with return type

//#include<stdio.h>
//float avg();
//int main()
//{
//    printf("Avg = %.2f",avg());
//}
//float avg()
//{
//    int a=10,b=20,c=30,d=40,e=50;
//    return (a+b+c+d+e)/5.0;
//}

// with para and with return type

#include<stdio.h>
float avg(int,int,int,int,int);
int main()
{
    printf("Avg = %.2f",avg(10,20,30,40,50));
}
float avg(int a,int b,int c,int d,int e)
{
    return (a+b+c+d+e)/5.0;
}

