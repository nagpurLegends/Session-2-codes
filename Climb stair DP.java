import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    // climb stairs tabulation (1,2,3)
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    
	    int[] dp = new int[n+1];
	    
	    dp[n]=1;
	    
	    for(int i=n-1;i>=0;i--){
	        int temp = 0;
	        
	        if(i+1<=n){
	            temp+=dp[i+1];
	        }
	        if(i+2<=n){
	            temp+=dp[i+2];
	        }
	        if(i+3<=n){
	            temp+=dp[i+3];
	        }
	        
	        dp[i]=temp;
	    }
	    
	    System.out.println(dp[0]);

	}
}