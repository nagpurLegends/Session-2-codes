import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    // goldmine
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
	    int n = scn.nextInt();
		int[][] a = new int[m][n];
		
		for(int i=0;i<m;i++){
		    for(int j=0;j<n;j++){
		        a[i][j]=scn.nextInt();
		    }
		}
		
		int[][] dp = new int[m][n];
		int ans = -2;
		for(int j=n-1;j>=0;j--){
		    for(int i=m-1;i>=0;i--){
		        if(j==n-1){
		            dp[i][j]=a[i][j];
		        }
		        else if(i==m-1){
		            dp[i][j]=a[i][j]+Math.max(dp[i][j+1],dp[i-1][j+1]);
		        }
		        else if(i==0){
		            dp[i][j]=a[i][j]+Math.max(dp[i][j+1],dp[i+1][j+1]);
		        }
		        else{
		            dp[i][j]=a[i][j]+Math.max(Math.max(dp[i][j+1],dp[i+1][j+1]),dp[i-1][j+1]);
		        }
		        
		        if(j==0){
		            ans = Math.max(ans,dp[i][j]);
		        }
		    }
		}
		
		System.out.println(ans);

	}
}
