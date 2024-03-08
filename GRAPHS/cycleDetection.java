package GRAPHS;

import java.util.*;
public class cycleDetection {

    public static class edge {

        int src;
        int dest;

        public edge(int src,int dest)
        {
            this.src=src;
            this.dest=dest;
        }
    }

    public static void create_graph(ArrayList<edge> graph[])
    {

        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new edge(0, 1));
        graph[0].add(new edge(0, 2));
        graph[0].add(new edge(0, 3));

        graph[1].add(new edge(1, 0));
        graph[1].add(new edge(1, 2));

        graph[2].add(new edge(2, 0));
        graph[2].add(new edge(2, 1));

        graph[3].add(new edge(3, 0));
        graph[3].add(new edge(3, 4));

        graph[4].add(new edge(4, 3));


    }

    public static boolean detect_cycle(ArrayList<edge> graph[])
    {
        boolean vis[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++)
        {
            if(!vis[i])
            {
                if(detect_cycle_dfs(graph,vis,i,-1))
                {
                    return true;
                }
            }
        }
        return false;
        
    }
    
    public static boolean detect_cycle_dfs(ArrayList<edge> graph[],boolean vis[],int start,int par)
    {
        vis[start]=true;
        
        for(int i=0;i<graph[start].size();i++)
        {
            edge e=graph[start].get(i);

            //case 1
            if(vis[e.dest] && e.dest!=par)
            {
                return true;
            }
            
            //case 2
            else if(!vis[e.dest] && detect_cycle_dfs(graph,vis,e.dest,start))
            {
                return true;
            }
        }
        
        return false;
        
    }

    public static void main(String[] args) {

        int v=5;
        ArrayList<edge> graph[]=new ArrayList[v];
        create_graph(graph);
        boolean ans=detect_cycle(graph);
        System.out.println(ans);
    }
}
