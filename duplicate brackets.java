import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    //duplicate brakets
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
		
		String s = scn.next();
		
		Stack<Character> st = new Stack<>();
		
		for(int i=0;i<s.length();i++){
		    char ch = s.charAt(i);
		    
		    if(ch==')'){
		        if(st.peek()=='('){
		            System.out.println("TRUE");
		            return;
		        }
		        while(st.peek()!='(')
		        st.pop();
		        
		        st.pop();
		    }
		    else{
		        st.push(ch);
		    }
		}
		
		System.out.println(false);
	}
}
