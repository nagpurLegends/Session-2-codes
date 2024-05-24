import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    // climb stair no of paths
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
		int ans = Stair_Path(n);
		System.out.println(ans);
		
// 		with memo

        
		int[] dp = new int[n+1];
	    Arrays.fill(dp,-1);
		ans = Stair_Path_memo(n,dp);
		System.out.println(ans);
	}
	
	public static int Stair_Path(int n){
	    if(n<0)
	    return 0;
	    
	    if(n==0)
	    return 1;
	    int m1 = Stair_Path(n-1);
	    int m2 = Stair_Path(n-2);
	    int m3 = Stair_Path(n-3);
	    
	    return m1+m2+m3;
	    
	}
	
	public static int Stair_Path_memo(int n,int[] dp){
	    if(n<0)
	    return 0;
	    
	    if(n==0)
	    return 1;
	    
	    if(dp[n]!=-1)
	    return dp[n];
	    
	    int m1 = Stair_Path_memo(n-1,dp);
	    int m2 = Stair_Path_memo(n-2,dp);
	    int m3 = Stair_Path_memo(n-3,dp);
	    
	    int fans = m1+m2+m3;
	    dp[n]=fans;
	    
	    return fans;
	    
	}
}
