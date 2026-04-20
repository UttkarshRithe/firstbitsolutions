//menu driven
#include<stdio.h>
int main()
{
    int num;
    printf("Enter a choice: 1.check number is even or odd \n 2.check number is prime or not\n3.check number is palindrome or not\n4.check number is positive ,negative or zero\n5.reverse a number\n6.find sum of digit\n");
    scanf("%d",&num);
    if (num==1)
    {
            int num;
            printf("Enter a number:");
            scanf("%d",&num);
            if (num%2==0)
            {
                printf("The number %d is even",num);
            }
            else
            {
                printf("The number %d is odd",num);
            }
    }
    else
    {
        if (num==2)
        {
            int num,i;
            printf("Enter a number:");
            scanf("%d",&num);
            for ( i = 2; i < num; i++)
            {
                if (num%i==0)
                {
                    break;
                } 
            }
            if (i==num)
            {
                printf("The number %d is prime",num);
            }
            else
            {
                printf("The number %d is not prime",num);
            }
            
        }
        else
        {
            if (num==3)
            {
                int num,i=0,rem,rev=0;
                printf("Enter a number:");
                scanf("%d",&num);
                int org = num;
                while (num>0)
                {
                    rem = num%10;
                    rev = rev*10+rem;
                    num=num/10;
                }
                if (org == rev)
                {
                    printf("Given number %d is palindrome",org);
                }
                else
                {
                    printf("Given number %d is not palindrome",org);
                }
            }
            else
            {
                if (num==4)
                {
                    int num;
                    printf("Enter a number:");
                    scanf("%d",&num);
                    if (num>0)
                    {
                        printf("given number %d is positive",num);
                    }
                    else
                    {
                        if (num<0)
                        {
                            printf("given number %d is negative ",num);
                        }
                        else
                        {
                            printf("given number is zero");
                        }
                        
                        
                    }
                    
                    
                }
                else
                {
                    if (num==5)
                    {
                        int num,rem,rev=0;
                        printf("Enter a number:");
                        scanf("%d",&num);
                        int org=num;
                        while (num>0)
                        {
                            rem=num%10;
                            rev=rev*10+rem;
                            num=num/10;
                        }
                        printf("Given number before reveser:%d",org);
                        printf("Given number is reverse:%d",rev);
                        
                    }
                    else
                    {
                        if (num==6)
                        {
                            int num,rem,sum=0;
                        printf("Enter a number:");
                        scanf("%d",&num);
                        while (num>0)
                        {
                            rem=num%10;
                            sum=sum+rem;
                            num=num/10;
                        }
                        printf("Sum of digit is:%d",sum);
                        }
                        
                    }
                    
                    
                }
                
                
            }
            
            
        }
        
        
    }
    
    
}   