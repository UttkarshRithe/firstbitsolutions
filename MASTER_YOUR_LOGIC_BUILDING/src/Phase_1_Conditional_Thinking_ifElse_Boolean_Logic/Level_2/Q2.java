package Phase_1_Conditional_Thinking_ifElse_Boolean_Logic.Level_2;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Fix 1 & 2

        System.out.println("Enter side1 of triangle:");
        int side1 = sc.nextInt();
        System.out.println("Enter side2 of triangle:");
        int side2 = sc.nextInt();
        System.out.println("Enter side3 of triangle:");
        int side3 = sc.nextInt();

        boolean isValid = (side1 + side2 > side3) &&
                          (side2 + side3 > side1) &&
                          (side1 + side3 > side2);

        if (isValid)
        {
            if (side1 == side2 && side2 == side3)
            {
                System.out.println("It is Equilateral Triangle!!");
            }
            else if (side1 == side2 || side2 == side3 || side1 == side3)  // Fix 3
            {
                System.out.println("It is Isosceles Triangle!!");
            }
            else
            {
                System.out.println("It is Scalene Triangle!!");  // Fix 4
            }
        }
        else
        {
            System.out.println("Invalid Triangle!!");
        }
    }
}