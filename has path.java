import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    // has path
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
        
        int src = 0,dest = 6;
        boolean[] vis = new boolean[n];
        boolean ans = haspath(graph,vis,src,dest);
        vis = new boolean[n];
        PrintAllPaths(graph,vis,0,6,src+" ");
        System.out.println(ans);

	}
	
	public static boolean haspath(List<List<Integer>> graph,boolean[] vis,int src,int dest){

        if(src==dest)
        return true; 

        vis[src]=true;

        for(int k : graph.get(src)){
            if(vis[k]==false){
                
                boolean f1 = haspath(graph,vis,k,dest);
                if(f1 == true)
                return true;
            }
        }

        return false;
    }
    
    public static void PrintAllPaths(List<List<Integer>> graph,boolean[] vis,int src,int dest,String asf){

        if(src==dest){
            System.out.println(asf);
            return;
        }
        
        vis[src]=true;

        for(int k : graph.get(src)){
            if(vis[k]==false){
                PrintAllPaths(graph,vis,k,dest,asf+k+" ");
            }
        }

        vis[src]=false;

    }
    
    
}
