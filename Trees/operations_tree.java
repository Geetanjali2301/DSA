public class operations_tree {

    class node{
        int data;
        node right;
        node left;

        public node(int data) {
            this.data=data;
            this.left=null;
            this.right=null;
            
        }
    }



    //height of tree
    public int height(node root)
    {
        if(root==null)
        {
            return -1;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        int ht=Math.max(lh,rh)+1;
        return ht;

    }

    //count of total number of nodes in the tree
    public int count(node root)
    {
        
        if(root==null)
        {
            return 0;
        }
        int left=count(root.left);
        int right=count(root.right);
        return left+right+1;

    }

    //sum of all nodes of a tree
    public int sum(node root)
    {
        
        if(root==null)
        {
            return 0;
        }
        int leftsum=sum(root.left);
        int rightsum=sum(root.right);
        return leftsum+rightsum+root.data;

    }

    public int diameter(node root)
    {
        if(root==null)
        {
            return 0;
        }
        int ld=diameter(root.left);
        int rd=diameter(root.right);
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh+rh+1,Math.max(ld,rd));
    }
  
    public static void main(String[] args) {
        operations_tree t=new operations_tree();
        node root=t.new node(10);
        root.left=t.new node(20);
        root.right=t.new node(30);
        root.left.left=t.new node(12);
        root.left.left.left=t.new node(13);
        System.out.println("Height of tree is: "+t.height(root));
        System.out.println("Num of nodes of tree is: "+t.count(root));
        System.out.println("Sum of nodes of tree is: "+t.sum(root));
        System.out.println("The diameter of tree is:  "+t.diameter(root));
       

    }
    
}
