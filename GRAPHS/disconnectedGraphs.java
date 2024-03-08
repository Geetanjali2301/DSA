package GRAPHS;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class disconnectedGraphs {

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
        graph[0].add(new edge(0, 2));

        graph[1].add(new edge(1, 0));

        graph[2].add(new edge(2, 0));
        graph[2].add(new edge(2, 3));

        graph[3].add(new edge(3, 2));

        graph[4].add(new edge(4, 5));

        graph[5].add(new edge(5, 4));
        graph[5].add(new edge(5, 6));

        graph[6].add(new edge(6, 5));

    }


    public static void print_bfs_util(ArrayList<edge> graph[],boolean vis[])
    {
        Queue<Integer> q=new LinkedList<>();

        q.add(0);

        while(!q.isEmpty())
        {
            int curr=q.remove();
            if(vis[curr]==false)
            {
                System.out.print(curr+" ");
                vis[curr]=true;

                for(int i=0;i<graph[curr].size();i++)
                {
                    edge e=graph[curr].get(i);
                    q.add(e.dest);
                }

            }
        }

    }


    //prints dfs traversal
    public static void print_dfs_util(ArrayList<edge> graph[],int start,boolean vis[])
    {
        
        System.out.print(start+" ");
        vis[start]=true;

        for(int i=0;i<graph[start].size();i++)
        {
            edge e=graph[start].get(i);
            if(vis[e.dest]==false)
            {
                print_dfs_util(graph,e.dest,vis);
            }

        }


    }

    public static void bfs(ArrayList<edge> graph[])
    {
        boolean vis[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++)
        {
            if(!vis[i])
            {
                print_bfs_util(graph, vis);
            }
            
        }
    }


    public static void dfs(ArrayList<edge> graph[])
    {
        boolean vis[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++)
        {
            if(!vis[i])
            {
                print_dfs_util(graph,i,vis);
            }
            
        }
    }

    public static void main(String[] args) {

        int v=7;
        ArrayList<edge> graph[]=new ArrayList[v];
        create_graph(graph);
        System.out.println("bfs: ");
        bfs(graph);
        System.out.println();
        System.out.println("dfs: ");
        dfs(graph);

    }
    
}
