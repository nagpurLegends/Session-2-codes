import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    //play with good strings
    public static boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch== 'u'){
            return true;
        }
        
        return false;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner scn = new Scanner(System.in);
		
		String s = scn.next();
		
		int ans = 0;
		int cnt=0;
		for(int i=0;i<s.length();i++){
		    char ch = s.charAt(i);
		    
		    if(isVowel(ch)){
		        cnt++;
		        ans = Math.max(ans,cnt);
		    }
		    else
		    cnt=0;
		}
		
		System.out.println(ans);
	}
	
	
}
