import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    // product lesss than k
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
	    
	    int n = scn.nextInt();
	    int[] a = new int[n];
	    
	    for(int i=0;i<n;i++)
	    a[i]=scn.nextInt();
	    
	    int k = scn.nextInt();
	    
	    int i=0,j=0, p=a[i];
	    int ans = 0;
	    while(j<a.length){
	        
	        if(p<k){
	            ans = Math.max(ans,j-i+1);
	            j++;
	            if(j>=a.length)
	            break;
	            p*=a[j];
	        }
	        else{
	            p/=a[i];
	            i++;
	        }
	    }
	    
	    System.out.println(ans);

	}
}
