import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    // 0-1 knapsack
	public static void main (String[] args) throws java.lang.Exception
	{
	    
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
	    int[] a = new int[n];
	    
	    for(int i=0;i<n;i++)
	    a[i]=scn.nextInt();
	    
	    int[] val = new int[n];
	    
	    for(int i=0;i<n;i++)
	    val[i]=scn.nextInt();
	    
	    int cap = scn.nextInt();
	    
	    int[][] dp = new int[a.length+1][cap+1];
	    
	    for(int i=0;i<dp.length;i++){
	        for(int j=0;j<dp[0].length;j++){
	            if(i==0 || j==0)
	            dp[i][j]=0;
	            else{
	                if(j-a[i-1]>=0){
	                    dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-a[i-1]]+val[i-1]);
	                }
	                else{
	                    dp[i][j]=dp[i-1][j];
	                }
	            }
	        }
	    }
	    
	    System.out.println(dp[a.length][cap]);

	}
}
