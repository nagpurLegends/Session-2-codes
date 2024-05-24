import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    //dijkastra
    public static class Edge{
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt){
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }
    
    public static class pair{
        int v;
        String psf;
        int wsf;
        
        pair(int v,String psf,int wsf){
            this.v=v;
            this.psf = psf;
            this.wsf = wsf;
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
        int vtces = scn.nextInt();
        int e = scn.nextInt();

        ArrayList<Edge>[] graph = new ArrayList[vtces];
        for(int i = 0; i < vtces; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i = 0; i < e; i++){

            int u = scn.nextInt();     
            int v = scn.nextInt();
            int wt = scn.nextInt();

            graph[u].add(new Edge(u, v, wt));
            graph[v].add(new Edge(v, u, wt)); 
        }
        int src = 0;
        PriorityQueue<pair> pq = new PriorityQueue<>((a,b)->{
                return a.wsf-b.wsf;
            });
        pq.add(new pair(src,src+" ",0));
        
        boolean[] vis = new boolean[vtces];
        
        while(pq.size()>0){
            int s = pq.size();
            while(s-->0){
                pair p = pq.remove();
                
                if(vis[p.v]==true)
                continue;
                
                vis[p.v]=true;
                
                System.out.println(p.v+" @ "+p.psf+" wt = "+p.wsf);
                
                for(Edge edge : graph[p.v]){
                    if(vis[edge.nbr]==false){
                        pq.add(new pair(edge.nbr,p.psf+edge.nbr+" ",p.wsf+edge.wt));
                    }
                }
            }
        }
        

	}
}
