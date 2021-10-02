package com.alcatel;
/* Java Program to check whether valid
expression is redundant or not*/
import java.util.Stack;
public class RedBrackets {
// Function to check redundant brackets in a
// balanced expression

	static boolean checkRedundancy(String s) {
		// create a stack of characters
		Stack<Character> st = new Stack<>();
		char[] str = s.toCharArray();
		// Iterate through the given expression
		for (char ch : str) {
            if(ch==')'){
            	char top=st.peek();
            	st.pop();
            	
            	boolean flag=true;
            	
            	while(top!='('){
            		
            		if(top=='*' || top == '+' || top == '/' || top=='-')
            			flag=false;
            		
            		top=st.pop();
            	}
            	
            	if(flag==true)
            	{
            		return true;
            	}
            	
            }else{
            	st.push(ch);
            }
		  
		}
		return false;
	}

// Function to check redundant brackets
	static void findRedundant(String str) {
		boolean ans = checkRedundancy(str);
		if (ans == true) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

// Driver code
	public static void main(String[] args) {
		String str = "((a+b))";
		findRedundant(str);

		str = "(a+(b)/c)";
		findRedundant(str);

		str = "(a+b*(c-d))";
		findRedundant(str);
	}
}
