import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    //target sum subset recursion
	public static void main (String[] args) throws java.lang.Exception{
	    Scanner scn = new Scanner(System.in);
	    
	    int n = scn.nextInt();
	    int[] a = new int[n];
	    
	    for(int i=0;i<n;i++)
	    a[i]=scn.nextInt();
	    
	    int tar = scn.nextInt();
	    
	    TSS(a,tar,"",0,0);
	}
	
	public static void TSS(int[] a,int tar,String asf,int sum,int i){
	    if(i==a.length){
	        if(sum==tar){
	            System.out.println(asf);
	        }
	        
	        return;
	    }
	    TSS(a,tar,asf+a[i]+"-",sum+a[i],i+1);
	    TSS(a,tar,asf,sum,i+1);
	}
}
