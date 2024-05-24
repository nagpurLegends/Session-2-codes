import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    //Knights tour
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int[][] a = new int[n][n];
	    
	    int i=scn.nextInt();
	    int j = scn.nextInt();
	    KnightsTour(a,i,j,1,n);

	}
	
	public static void print(int[][] a){
	    int n = a.length;
	    
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n;j++){
	            System.out.print(a[i][j]+" ");
	        }
	        System.out.println();
	    }
	    
	    System.out.println("\n\n");
	}
	
	public static void KnightsTour(int[][] a,int i,int j,int move,int n){
	    
	    if(i<0 || i>=n || j<0 || j>=n || a[i][j]!=0)
	    return;
	    
	    if(move==n*n){
	        a[i][j]=move;
	        print(a);
	        a[i][j]=0;
	        return;
	    }
	    
	    a[i][j]=move;
	    KnightsTour(a,i-2,j+1,move+1,n);
	    KnightsTour(a,i-2,j-1,move+1,n);
	    KnightsTour(a,i+2,j+1,move+1,n);
	    KnightsTour(a,i+2,j+1,move+1,n);
	    KnightsTour(a,i-1,j+2,move+1,n);
	    KnightsTour(a,i-1,j-2,move+1,n);
	    KnightsTour(a,i+1,j+2,move+1,n);
	    KnightsTour(a,i+1,j-2,move+1,n);
	    
	    a[i][j]=0;
	    
	    
	}
}
