public class Tree {
    static class treenode{
        int data;
        treenode left;
        treenode right;

        public treenode(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static treenode get_node(int data)
    {
        return  new treenode(data);
    }

    public static treenode insert_treenode(int data,treenode parent,char child)
    {
        if(parent!=null)
        {
            if(child=='l')
            {
                parent.left=new treenode(data);
                if(parent.left!=null)
                {
                    return parent.left;
                }
            }
            else if(child=='r')
            {
                parent.right=new treenode(data);
                if(parent.right!=null)
                {
                    return parent.right;
                }
            }

        }

        return parent;   
    }

    public static void inorder(treenode root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);

    }

    public static void main(String[] args) {
        treenode root=get_node(10);
        insert_treenode(5, root, 'l');
        insert_treenode(12, root, 'r');
        insert_treenode(25, root.left, 'l');
        insert_treenode(67, root.right, 'l');
        inorder(root);

    }    
}
