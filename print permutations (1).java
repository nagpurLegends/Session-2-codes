import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    //print permutations
	public static void main (String[] args) throws java.lang.Exception
	{
		String s = "abc";
		
		print_per(s,"");

	}
	
	public static void print_per(String s,String asf){
	    
	    if(s.length()==0){
	        System.out.println(asf);
	        return;
	    }
	    for(int i=0;i<s.length();i++){
	        char ch = s.charAt(i);
	        String res = s.substring(0,i)+s.substring(i+1);
	        print_per(res,asf+ch);
	        
	    }
	}
}
