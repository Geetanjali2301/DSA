package GRAPHS;

import java.util.*;

public class hasPath {

    public static class edge{
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
        graph[0].add(new edge(0, 4));

        graph[1].add(new edge(1, 2));
        graph[1].add(new edge(1, 0));

        graph[2].add(new edge(2, 1));
        graph[2].add(new edge(2, 3));

        graph[3].add(new edge(3, 2));
        graph[3].add(new edge(3, 4));

        graph[4].add(new edge(4, 0));
        graph[4].add(new edge(4, 3));

    }

    public static boolean hasPath(ArrayList<edge> graph[],int src,int dest,boolean vis[])
    {
        //Checking condition if src and dest are same
        if(src==dest)
        {
            return true;
        }

        vis[src]=true;

        //call for all current source neighbours to check whether they can return me true or not recursively
        for(int i=0;i<graph[src].size();i++)
        {
            edge e=graph[src].get(i);
            if(!vis[e.dest] && hasPath(graph, e.dest, dest,vis))
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int v=5;
        ArrayList<edge> graph[]=new ArrayList[v];
        boolean vis[]=new boolean[graph.length];
        create_graph(graph);
        boolean ans=hasPath(graph, 0, 9,vis);
        System.out.println(ans);

    }
    
}
