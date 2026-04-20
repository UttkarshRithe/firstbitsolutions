// VOWEL OR CONSONANT
// w/o para and w/o return type

//#include<stdio.h>
//void checkChar();
//int main()
//{
//    checkChar();
//}
//void checkChar()
//{
//    char ch = 'a';
//    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
//        printf("Vowel");
//    else
//        printf("Consonant");
//}

// with para and w/o return type

//#include<stdio.h>
//void checkChar(char);
//int main()
//{
//    char ch = 'b';
//    checkChar(ch);
//}
//void checkChar(char ch)
//{
//    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
//        printf("Vowel");
//    else
//        printf("Consonant");
//}

// w/o para and with return type

//#include<stdio.h>
//int checkChar();
//int main()
//{
//    int res = checkChar();
//    if(res == 1)
//        printf("Vowel");
//    else
//        printf("Consonant");
//}
//int checkChar()
//{
//    char ch = 'e';
//    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
//        return 1;
//    else
//        return 0;
//}

// with para and with return type

#include<stdio.h>
int checkChar(char);
int main()
{
    char ch = 'z';
    int res = checkChar(ch);
    if(res == 1)
        printf("Vowel");
    else
        printf("Consonant");
}
int checkChar(char ch)
{
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        return 1;
    else
        return 0;
}

