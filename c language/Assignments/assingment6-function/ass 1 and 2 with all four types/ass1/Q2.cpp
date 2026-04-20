// AREA OF CIRCLE
// w/o para and w/o return type

//#include<stdio.h>
//void area();
//int main()
//{
//    area();
//}
//void area()
//{
//    float r=7;
//    printf("Area = %.2f",3.14*r*r);
//}

// with para and w/o return type

//#include<stdio.h>
//void area(float);
//int main()
//{
//    float r=7;
//    area(r);
//}
//void area(float r)
//{
//    printf("Area = %.2f",3.14*r*r);
//}

// w/o para and with return type

//#include<stdio.h>
//float area();
//int main()
//{
//    printf("Area = %.2f",area());
//}
//float area()
//{
//    float r=7;
//    return 3.14*r*r;
//}

// with para and with return type

#include<stdio.h>
float area(float);
int main()
{
    float r=7;
    printf("Area = %.2f",area(r));
}
float area(float r)
{
    return 3.14*r*r;
}

