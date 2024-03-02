// Array implementation of the binary tree

public class treeArrayImplementation {

    static int arr[]=new int[5];
   

    public void add(int data)
    {
        if(arr[0]==0)
        {
            arr[0]=data;
            return;
        }
    }

    public void add_lchild(int parent_i,int data)
    {
        if(arr[parent_i]!=0)
        {
            if(arr[parent_i*2 + 1]==0)
            {
                arr[parent_i*2 +1]=data;
                return;
            }
            else{
                System.out.println("Left child is present!");
            }

        }
        else{
            System.out.println("Parent is not present!");
        }

    }
    public void add_rchild(int parent_i,int data)
    {
        if(arr[parent_i]!=0)
        {
            if(arr[parent_i*2 + 2]==0)
            {
                arr[parent_i*2 +2]=data;
                return;
            }
            else{
                System.out.println("Right child is present!");
            }

        }
        else{
            System.out.println("Parent is not present!");
        }

    }

    public void print(int arr[])
    {
        int i=0;
        while(i<arr.length)
        {
            System.out.print(arr[i]+" ");
            i++;
        }
        

    }

    public static void main(String[] args) {
        treeArrayImplementation t=new treeArrayImplementation();
        
        t.add(10);
        t.add_lchild(0, 20);
        t.add_rchild(0, 30);
        t.add_lchild(1, 11);
        t.add_rchild(1,12 );
        t.print(arr);

    }

    
}
