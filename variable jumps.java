import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    // climb stairs with variable jumps
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    
	    int[] a = new int[n];
	    
	    for(int i=0;i<n;i++)
	    a[i]=scn.nextInt();
	    
	    
	    int[] dp = new int[n+1];
	    
	    dp[n]=1;
	    
	    for(int i=n-1;i>=0;i--){
	        int temp = 0;
	        for(int j=1;j<=a[i] && i+j<=n;j++){
	            temp+=dp[i+j];
	        }
	        dp[i]=temp;
	    }
	    
	    
	    System.out.println(dp[0]);

	}
}
