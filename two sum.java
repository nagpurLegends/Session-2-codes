import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    //two sum
    public static int BruteForce(int[] a,int tar){
        int ans=0;
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==tar)
                ans++;
            }
        }
        
        return ans;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    
	    int[] a = new int[n];
	    
	    for(int i=0;i<n;i++)
	    a[i]=scn.nextInt();
	    
	    Arrays.sort(a);
	    int tar =9,ans=0;
	    int i=0,j=n-1;
	    
	    while(j>i){
	        if(a[i]+a[j]>tar){
	            j--;
	        }
	        else if(a[i]+a[j]<tar){
	            i++;
	        }
	        else{
	            ans++;
	            i++;
	            j--;
	        }
	        
	    }
	    
	    System.out.println(ans);
	    System.out.println(BruteForce(a,9));

	}
}
