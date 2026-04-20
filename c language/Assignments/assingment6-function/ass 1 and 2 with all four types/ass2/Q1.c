//even or odd using w/o para and w/o return type
// void evenodd();
// #include<stdio.h>
// int main()
// {
//     evenodd();
// }
// void evenodd()
// {
//     int num=5;
//     if (num%2==0)
//     {
//         printf("Given num %d is even ",num);
//     }
//     else
//     {
//         printf("Given num %d is odd ",num);
//     }
// }

//with para w/o return type
// #include<stdio.h>
// void evenodd(int);
// int main()
// {
//     int num=5;
//     evenodd(num);
// }
// void evenodd(int num)
// {
//     if (num%2==0)
//     {
//         printf("given num %d is even ",num);
//     }
//     else
//     {
//         printf("Given num %d is odd ",num);
//     }
// }

//w/o para with return type
// #include<stdio.h>
// int evenodd();
// int main()
// {
//    int res = evenodd();
//    res==1?printf("given num is even"):printf("Given num is odd");
   
// }
// int evenodd()
// {
//     int num=4;
//     return num%2==0;
// }

// with para and return type
// #include<stdio.h>
// int evenodd(int);
// int main()
// {
//     int num =4;
//     int res =  evenodd(num);
//     res==1?printf("given num is even"):printf("Given num is odd");
// }
// int evenodd(int num)
// {
//     return num%2==0;
// }
