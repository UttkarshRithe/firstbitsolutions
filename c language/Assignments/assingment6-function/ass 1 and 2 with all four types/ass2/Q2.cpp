//check palindrom 
//w/o para and return type

// #include<stdio.h>
// void isPalindrome();
// int main()
// {
//     isPalindrome();
// }
// void isPalindrome()
// {
//     int num=121,rev,rem;
//     int org = num;
//     while (num>0)
//     {
//         rem = num%10;
//         rev = rev*10+rem;
//         num = num/10;
//     }
//     if (org==rev)
//     {
//         printf("Given number %d is palindrome",org);
//     }
    
// }

//with para without return type

//#include<stdio.h>
//void isPalindrom(int);
//int main()
//{
//    int num=121;
//    isPalindrom(num);
//}
//void isPalindrom(int num)
//{
//    int org = num,rem,rev;
//    while (num>0)
//    {
//	    
//		rem = num%10;
//        rev = rev*10+rem;
//        num = num/10;
//    }
//    if (org==rev)
//    {
//        printf("Given number %d is palindrome",org);
//    }
//}

//without para with return type

//#include<stdio.h>
//int isPalindrom();
//int main()
//{
//   int res = isPalindrom();
//   if(res==1)
//   		 printf("Given number  is palindrome");
//   else
//   		 printf("Given number  is not palindrome");			 
//   
//}
//int isPalindrom()
//{
//	int num=121;
//    int org = num,rem,rev=0;
//    while (num>0)
//    {
//	    
//		rem = num%10;
//        rev = rev*10+rem;
//        num = num/10;
//    }
//    if (org==rev)
//       return 1;
//    else
//    	return 0;
//}

//with para and with return type

#include<stdio.h>
int isPalindrom(int);
int main()
{
	int num=121;
   int res = isPalindrom(num);
   if(res==1)
   		 printf("Given number  is palindrome");
   else
   		 printf("Given number  is not palindrome");			 
   
}
int isPalindrom(int num)
{
    int org = num,rem,rev=0;
    while (num>0)
    {
	    
		rem = num%10;
        rev = rev*10+rem;
        num = num/10;
    }
    if (org==rev)
       return 1;
    else
    	return 0;
}


