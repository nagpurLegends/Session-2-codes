import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    //get connected components
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
        List<List<Integer>> comps = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(vis[i]==false){
                List<Integer> comp = new ArrayList<>();
                gcc(graph,i,vis,comp);
                comps.add(comp);
            }
        }
        
        System.out.println(comps);

	}
	
	public static void gcc(List<List<Integer>> graph,int src,boolean[] vis,List<Integer> comp){
	    
	    vis[src]=true;
	    comp.add(src);
	    for(int k : graph.get(src)){
	        if(vis[k]==false){
	            gcc(graph,k,vis,comp);
	        }
	    }
	}
}
