// UPPERCASE OR LOWERCASE
// w/o para and w/o return type

//#include<stdio.h>
//void checkCase();
//int main()
//{
//    checkCase();
//}
//void checkCase()
//{
//    char ch = 'A';
//    if(ch >= 'A' && ch <= 'Z')
//        printf("Uppercase");
//    else
//        printf("Lowercase");
//}

// with para and w/o return type

//#include<stdio.h>
//void checkCase(char);
//int main()
//{
//    char ch = 'g';
//    checkCase(ch);
//}
//void checkCase(char ch)
//{
//    if(ch >= 'A' && ch <= 'Z')
//        printf("Uppercase");
//    else
//        printf("Lowercase");
//}

// w/o para and with return type

//#include<stdio.h>
//int checkCase();
//int main()
//{
//    int res = checkCase();
//    if(res == 1)
//        printf("Uppercase");
//    else
//        printf("Lowercase");
//}
//int checkCase()
//{
//    char ch = 'M';
//    if(ch >= 'A' && ch <= 'Z')
//        return 1;
//    else
//        return 0;
//}

// with para and with return type

#include<stdio.h>
int checkCase(char);
int main()
{
    char ch = 'k';
    int res = checkCase(ch);
    if(res == 1)
        printf("Uppercase");
    else
        printf("Lowercase");
}
int checkCase(char ch)
{
    if(ch >= 'A' && ch <= 'Z')
        return 1;
    else
        return 0;
}

