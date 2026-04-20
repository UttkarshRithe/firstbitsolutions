// AREA OF TRIANGLE
// w/o para and w/o return type

//#include<stdio.h>
//void area();
//int main()
//{
//    area();
//}
//void area()
//{
//    float b=10,h=5;
//    printf("Area=%.2f",0.5*b*h);
//}

// with para and w/o return type

//#include<stdio.h>
//void area(float,float);
//int main()
//{
//    area(10,5);
//}
//void area(float b,float h)
//{
//    printf("Area=%.2f",0.5*b*h);
//}

// w/o para and with return type

//#include<stdio.h>
//float area();
//int main()
//{
//    printf("Area=%.2f",area());
//}
//float area()
//{
//    float b=10,h=5;
//    return 0.5*b*h;
//}

// with para and with return type

#include<stdio.h>
float area(float,float);
int main()
{
    printf("Area=%.2f",area(10,5));
}
float area(float b,float h)
{
    return 0.5*b*h;
}

