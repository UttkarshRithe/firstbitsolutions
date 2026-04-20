// PERIMETER OF RECTANGLE
// w/o para and w/o return type

//#include<stdio.h>
//void peri();
//int main()
//{
//    peri();
//}
//void peri()
//{
//    int l=10,w=5;
//    printf("Perimeter=%d",2*(l+w));
//}

// with para and w/o return type

//#include<stdio.h>
//void peri(int,int);
//int main()
//{
//    peri(10,5);
//}
//void peri(int l,int w)
//{
//    printf("Perimeter=%d",2*(l+w));
//}

// w/o para and with return type

//#include<stdio.h>
//int peri();
//int main()
//{
//    printf("Perimeter=%d",peri());
//}
//int peri()
//{
//    int l=10,w=5;
//    return 2*(l+w);
//}

// with para and with return type

#include<stdio.h>
int peri(int,int);
int main()
{
    printf("Perimeter=%d",peri(10,5));
}
int peri(int l,int w)
{
    return 2*(l+w);
}

