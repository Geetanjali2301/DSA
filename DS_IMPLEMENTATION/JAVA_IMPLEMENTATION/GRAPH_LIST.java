import java.util.*;
import java.util.LinkedList;

public class GRAPH_LIST {

    static Scanner sc=new Scanner(System.in);

    public static class edge{
        int src;
        int dest;
        int wt;

        edge(int src,int dest,int wt)
        {
            this.src=src;
            this.dest=dest;
            this.wt=wt;
        }
    }


    //initialization of an empty graph
    public static ArrayList<edge>[] create_graph()
    {
        System.out.println("Enter number of vertices: ");
        int v=sc.nextInt();

        ArrayList<edge> graph[]=new ArrayList[v];

        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }
        return graph;

    }


    //adding edge from src -> dest
    public static void add_edge(ArrayList<edge> graph[])
    {
        System.out.println("Enter edge details: ");

        System.out.println("Enter the src: ");
        int src=sc.nextInt();

        System.out.println("Enter the dest: ");
        int dest=sc.nextInt();

        System.out.println("Enter the wt: ");
        int wt=sc.nextInt();

        graph[src].add(new edge(src,dest,wt));

    }


    //prints bfs traversal
    public static void print_bfs(ArrayList<edge> graph[])
    {
        System.out.println("BFS Traversal: ");
        boolean vis[]=new boolean[graph.length];
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
    public static void print_dfs(ArrayList<edge> graph[],int start)
    {
        boolean vis[]=new boolean[graph.length];
        System.out.print(start+" ");
        vis[start]=true;

        for(int i=0;i<graph[start].size();i++)
        {
            edge e=graph[start].get(i);
            if(vis[e.dest]==false)
            {
                print_dfs(graph,e.dest);
            }

        }


    }


    public static void print_graph(ArrayList<edge> graph[])
    {
        for(int j=0;j<graph.length;j++){

            for(int i=0;i<graph[j].size();i++){

                edge e=graph[j].get(i);
                System.out.println("src: "+e.src+"-> dest: "+e.dest+"-> wt: "+e.wt);
            }

        }

    }


    public static void main(String[] args) {
        ArrayList<edge> graph[]=create_graph();
        boolean flag=true;

        while(flag){

            System.out.println("\nMenu: \n1]Add Edge \n2]Print Graph \n3]BFS \n4]DFS \n5]Exit");
            System.out.println("\nEnter your chioce: ");
            int choice=sc.nextInt();

            switch(choice)
            {
                case 1:
                    add_edge(graph);
                    break;
                case 2:
                    print_graph(graph);    
                    break;
                case 3:
                    print_bfs(graph);
                    break;
                case 4:
                    System.out.println("DFS Traversal: ");
                    print_dfs(graph,0);
                    break;    
                case 5:
                    flag=false;
                    break;    
            }

        }
              
    }
    
}
