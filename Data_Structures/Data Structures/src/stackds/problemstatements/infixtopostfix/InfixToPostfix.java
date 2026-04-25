package stackds.problemstatements.infixtopostfix;

import java.util.Scanner;

import stackds.problemstatements.equationbalanced.Stack;

public class InfixToPostfix
{

	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter String: ");
		String str=sc.nextLine();
		
		
		Stack s1 = new Stack(str.length());
		
		String postfix="";
		
		for(int i=0;i<str.length();i++)
		{
			char x = str.charAt(i);
			
			if( x=='+' || x=='-' || x=='*'|| x=='/' ||
					x=='('||x=='['||x=='{')
			{
				if(!s1.isEmpty()&&checkprecedence(x,s1.peek()))
				{
					postfix+=s1.peek();
					s1.pop();
					s1.push(x);
				}
				else
				{
					s1.push(x);
				}
			}
			else if(x==')' || x==']' || x=='}')
			{
				while(s1.peek()!='(' && s1.peek()!='[' && s1.peek()!='{')
				{
						postfix+=s1.peek();
						s1.pop();
				}
				s1.pop();
			}
			else
			{
				postfix += x;
			}
			
		}
		while(!s1.isEmpty()) {
			postfix += s1.peek();
			s1.pop();
		}
		System.out.println("postFix: " + postfix);
		sc.close();
	}
	
	public static boolean checkprecedence(char c, char peek)
	{
	    if( (c=='+' || c=='-') && (peek=='*' || peek=='/')
	     || (c=='+' || c=='-') && (peek=='+' || peek=='-')
	     || (c=='*' || c=='/') && (peek=='*' || peek=='/') )
	    {
	        return true;
	    }
	    else
	    {
	        return false;
	    }
	}
	
	
	
}