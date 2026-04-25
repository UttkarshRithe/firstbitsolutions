package stackds.problemstatements.stringpalindrome;

import java.util.Scanner;
import stackds.problemstatements.equationbalanced.Stack;

public class StringPalindrome {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String str = sc.next().toLowerCase();
		
		Stack s1 = new Stack(str.length());
		
		String org=str;
		
		for(int i=0;i<str.length();i++)
		{
			char x = str.charAt(i);
			s1.push(x);
		}
		
		String temp="";
		
		while(!s1.isEmpty())
		{
			temp+=s1.peek();
			s1.pop();
		}
		
		if(org.equals(temp))
		{
			System.out.println("String is Palindrome!!");
		}
		else
		{
			System.out.println("Not palindrome!!");
		}
		
		
	}
}
