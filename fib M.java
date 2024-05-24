import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    //fib with memo
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int[] dp = new int[n+1];
	    Arrays.fill(dp,-1);
	    int ans = fib(n,dp);
	    System.out.println(ans);
	}
	
	public static int fib(int n,int[] dp){
	    if(n==1 || n==0)
	    return n;
	    
	    if(dp[n]!=-1)
	    return dp[n];
	    
	    System.out.println("hello "+n);
	    int k1 = fib(n-1,dp);
	    int k2 = fib(n-2,dp);
	    
	    dp[n]=k1+k2;
	    return k1+k2;
	    
	    
	}
}
