package Phase_1_Conditional_Thinking_ifElse_Boolean_Logic.Level_2;

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   // Fix 1 & 2

        System.out.println("Enter num1:");
        int num1 = sc.nextInt();
        System.out.println("Enter num2:");
        int num2 = sc.nextInt();

        // Fix 3 — Guard against division by zero
        if (num1 == 0 || num2 == 0)
        {
            System.out.println("Invalid input!! Numbers cannot be zero.");
        }
        else if (num1 % num2 == 0)
        {
            System.out.println("num1 is multiple of num2!!");
        }
        else if (num2 % num1 == 0)
        {
            System.out.println("num2 is multiple of num1!!");
        }
        else
        {
            System.out.println("None of the number is multiple of other!!");
        }
    }
}