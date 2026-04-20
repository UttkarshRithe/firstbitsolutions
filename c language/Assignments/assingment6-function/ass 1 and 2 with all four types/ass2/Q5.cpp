// VOTING ELIGIBILITY
// w/o para and w/o return type

//#include<stdio.h>
//void checkVote();
//int main()
//{
//    checkVote();
//}
//void checkVote()
//{
//    int age = 20;
//    if(age >= 18)
//        printf("Eligible to Vote");
//    else
//        printf("Not Eligible to Vote");
//}

// with para and w/o return type

//#include<stdio.h>
//void checkVote(int);
//int main()
//{
//    int age = 16;
//    checkVote(age);
//}
//void checkVote(int age)
//{
//    if(age >= 18)
//        printf("Eligible to Vote");
//    else
//        printf("Not Eligible to Vote");
//}

// w/o para and with return type

//#include<stdio.h>
//int checkVote();
//int main()
//{
//    int res = checkVote();
//    if(res == 1)
//        printf("Eligible to Vote");
//    else
//        printf("Not Eligible to Vote");
//}
//int checkVote()
//{
//    int age = 19;
//    if(age >= 18)
//        return 1;
//    else
//        return 0;
//}

// with para and with return type

#include<stdio.h>
int checkVote(int);
int main()
{
    int age = 17;
    int res = checkVote(age);
    if(res == 1)
        printf("Eligible to Vote");
    else
        printf("Not Eligible to Vote");
}
int checkVote(int age)
{
    if(age >= 18)
        return 1;
    else
        return 0;
}

