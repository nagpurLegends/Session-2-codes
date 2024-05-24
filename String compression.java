import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    // String compression
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
		
		String s = scn.next();
		
		StringBuilder sb = new StringBuilder("");
		
		for(int i=0;i<s.length();i++){
		    char ch = s.charAt(i);
		    
		    if(sb.length()==0 || sb.charAt(sb.length()-1)!=ch){
		        sb.append(ch);
		    }
		}
		
		System.out.println(sb);

	}
}
