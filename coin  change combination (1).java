import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    // coin  change combination (1)
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scn = new Scanner(System.in);
	    
	    int n = scn.nextInt();
	    int[] a = new int[n];
	    
	    for(int i=0;i<n;i++)
	    a[i]=scn.nextInt();
	    
	    int tar = scn.nextInt();
	    
	    int[] dp = new int[tar+1];
	    
	    dp[0]=1;
	    
	    for(int i=0;i<a.length;i++){
	        for(int j=a[i];j<dp.length;j++){
	            dp[j]+=dp[j-a[i]];
	        }
	    }
	    
	    System.out.println(dp[tar]);
		

	}
}
