import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    // coin  change permutation
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
	    
	    for(int i=0;i<dp.length;i++){
	        for(int j=0;j<a.length;j++){
	            if(i-a[j]>=0)
	            dp[i]+=dp[i-a[j]];
	        }
	    }
	    
	    System.out.println(dp[tar]);
		

	}
}
