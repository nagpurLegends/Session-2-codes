import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    // is graph cyclic
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int m = scn.nextInt();
	    
	    int[][] edges = new int[m][2];
	    
	    for(int i=0;i<m;i++){
	        edges[i][0]=scn.nextInt();
	        edges[i][1]=scn.nextInt();
	        
	    }
		List<List<Integer>> graph = new ArrayList<>();

        for(int i=0;i<n;i++)
        graph.add(new ArrayList<>());

        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];

            graph.get(u).add(v);
            graph.get(v).add(u);
            
        }
        boolean[] vis = new boolean[n];
        for(int i=0;i<n;i++){
            if(vis[i]==false){
                boolean iscycle= iscyclic(graph,vis,i);
                if(iscycle){
                    System.out.println("Yes Cyclic");
                    return;
                }
                
            }
        }
        
        System.out.println("Not Cyclic");

	}
	
	public static boolean iscyclic(List<List<Integer>> graph,boolean[] vis,int v){
        
        Queue<Integer> q = new ArrayDeque<>();
        q.add(v);
        
        while(q.size()>0){
            int p = q.remove();
            
            if(vis[p]==true)
            return true;
            
            vis[p]=true;
            
            for(int k : graph.get(p)){
                if(vis[k]==false)
                q.add(k);
            }
        }
        
        return false;
    }
}
