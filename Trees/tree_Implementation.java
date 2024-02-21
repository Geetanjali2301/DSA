//Linked list representation of tree
public class tree_Implementation {

    class node{
        int data;
        node left;
        node right;

        public node(int data)
        {
            this.data=data;
            this .left=null;
            this.right=null;
        }

    }

    public static void preorder(node root)
    {
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }


    public static void main(String[] args) {

        tree_Implementation t=new tree_Implementation();
        node root=t.new node(10);
        root.left=t.new node(20);
        root.left.left=t.new node(11);
        root.left.right=t.new node(12);
        root.right=t.new node(13);

        preorder(root);

       
        

        


        

    }
    
}
