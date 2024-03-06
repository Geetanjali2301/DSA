import java.util.*;
import java.util.LinkedList;
public class GRAPH_MATRIX {

    static Scanner sc=new Scanner(System.in);

    public static int[][] creategraph()
    {
        System.out.println("Enter the number of vertices: ");
        int v=sc.nextInt();

        int graph[][]=new int[v][v];

        for(int i=0;i<v;i++)
        {
            for(int j=0;j<v;j++)
            {
                graph[i][j]=0;
            }
        }

        return graph;
    }


    public static void add_edge(int[][] graph)
    {
        System.out.println("Enter edge details: ");
        System.out.println("Enter src: ");
        int src=sc.nextInt();

        System.out.println("Enter dest: ");
        int dest=sc.nextInt();

        System.out.println("Enter wt: ");
        int wt=sc.nextInt();

        if(graph[src][dest]==0)
        {
            graph[src][dest]=wt;
        }
        else
        {
            System.out.println("Edge already exists!");
        }
    }


    public static void print_bfs(int[][] graph)
    {
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

                for(int j=0;j<graph.length;j++)
                {
                    if(graph[curr][j]>0)
                    {
                        q.add(j);
                    }
                }
            }
        }
    }


    public static void print_dfs(int[][] graph,int start)
    {
        boolean vis[]=new boolean[graph.length];
        System.out.print(start+" ");
        vis[start]=true;

        for(int j=0;j<graph.length;j++)
        {
            if(graph[start][j]>0)
            {
               if(vis[j]==false)
               {
                print_dfs(graph, j);
               }
            }

        }
    }

    
    public static void print_matrix(int[][] graph)
    {
        for(int i=0;i<graph.length;i++)
        {
            for(int j=0;j<graph.length;j++)
            {
                System.out.print(graph[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static void print_graph(int[][] graph)
    {
        for(int i=0;i<graph.length;i++)
        {
            for(int j=0;j<graph.length;j++)
            {
                int src=i;
                int dest=j;
                if(graph[i][j]>0)
                {
                    System.out.println("src: "+src+"-> dest: "+dest+"-> wt: "+graph[src][dest]);

                }

            }
        }
    }

    public static void main(String[] args) {

        int[][] graph=creategraph();

        boolean flag=true;

        while(flag)
        {

        System.out.println("\nMenu: \n1]Add Edge \n2]Print Graph \n3]Print Graph Matrix \n4]BFS \n5]DFS \n6]Exit");
        System.out.println("\nEnter your choice: ");
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
                    print_matrix(graph);
                    break; 
                case 4:
                    System.out.println("BFS Traversal: ");
                    print_bfs(graph);       
                    break;
                case 5:
                    System.out.println("DFS Traversal: ");
                    print_dfs(graph,0);
                    break;
                case 6:
                    flag=false;
                    break;    
            }

        }
   
    }
    
}
