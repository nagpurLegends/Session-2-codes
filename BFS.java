import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    //BFS
    
    public static class pair{
        int v;
        String psf;
        
        pair(int v,String psf){
            this.v= v;
            this.psf = psf;
        }
    }
	public static void main (String[] args) throws java.lang.Exception{
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
        
        Queue<pair> q = new ArrayDeque<>();
        
        int src = scn.nextInt();
        q.add(new pair(src,src+"-"));
        
        while(q.size()>0){
            int s = q.size();
            
            while(s-->0){
                pair p = q.remove();
                
                if(vis[p.v]==true)
                continue;
                
                vis[p.v]=true;
                
                System.out.println(p.v+" @ "+p.psf);
                
                for(int k : graph.get(p.v)){
                    if(vis[k]==false)
                    q.add(new pair(k,p.psf+k+"-"));
                }
            }
        }
        
        
	}
}
