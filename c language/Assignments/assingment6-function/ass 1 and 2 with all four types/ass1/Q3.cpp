// CELSIUS TO FAHRENHEIT
// w/o para and w/o return type

//#include<stdio.h>
//void convert();
//int main()
//{
//    convert();
//}
//void convert()
//{
//    float c=25;
//    printf("F = %.2f",(c*9/5)+32);
//}

// with para and w/o return type

//#include<stdio.h>
//void convert(float);
//int main()
//{
//    float c=25;
//    convert(c);
//}
//void convert(float c)
//{
//    printf("F = %.2f",(c*9/5)+32);
//}

// w/o para and with return type

//#include<stdio.h>
//float convert();
//int main()
//{
//    printf("F = %.2f",convert());
//}
//float convert()
//{
//    float c=25;
//    return (c*9/5)+32;
//}

// with para and with return type

#include<stdio.h>
float convert(float);
int main()
{
    float c=25;
    printf("F = %.2f",convert(c));
}
float convert(float c)
{
    return (c*9/5)+32;
}

