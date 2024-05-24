import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    //next greater to the right
	public static void main (String[] args) throws java.lang.Exception{
	    Scanner scn = new Scanner(System.in);
	    
	    int n = scn.nextInt();
	    int[] a = new int[n];
	    
	    for(int i=0;i<n;i++)
	    a[i]=scn.nextInt();
	    
	    int[] ans = new int[n];
	    
	    ans[n-1]=-1;
	    
	    Stack<Integer> st = new Stack<>();
	    st.push(a[n-1]);
	    for(int i=n-2;i>=0;i--){
	        
	        while(st.size()!=0 && a[i]>=st.peek())
	        st.pop();
	        
	        if(st.size()==0)
	        ans[i]=-1;
	        else
	        ans[i]=st.peek();
	        
	        st.push(a[i]);
	    }
	    
	    for(int i=0;i<n;i++){
	        System.out.print(a[i]+" ");
	    }
	    System.out.println();
	    for(int i=0;i<n;i++){
	        System.out.print(ans[i]+" ");
	    }
	}
}
