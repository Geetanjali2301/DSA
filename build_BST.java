public class build_BST {

    static class node{
        int data;
        node left;
        node right;

        public node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;

        }
    }

    

    public static node create_bst(node root,int data)
    {
        if(root==null)
        {
            root=new node(data);
            return root;
        }

        if(data<root.data)
        {
            root.left=create_bst(root.left, data);
        }
        else if(data>root.data)
        {
            root.right=create_bst(root.right, data);
        }
        return root;
    }

    public static void inorder(node root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }


    public static node inordersuccessor(node root)
    {
        while(root.left!=null)
        {
            root=root.left;
        }
        return root;
    }

    public static node delete(node root,int val)
    {
        if(val>root.data)
        {
           root.right=delete(root.right, val);
        }
        else if(val<root.data)
        {
            root.left=delete(root.left,val);
        }
        else
        {
            //case 1 node is leaf node
            if(root.left==null && root.right==null)
            {
                return null;
            }
            
            //case 2 single child node

            if(root.left==null)
            {
                return root.right;
            }
            else if(root.right==null)
            {
                return root.left;
            }

            //case 3 double child 

            node insuc=inordersuccessor(root.right);
            root.data=insuc.data;
            root.right=delete(root.right,insuc.data);
        
        }
        return root;
    }

    

    public static int search(int val,node root)
    {
        if(root==null)
        {
            return 0;
        }

        if(root.data==val)
        {  
            return 1;
        }
        else if(val<root.data)
        {
            search(val, root.left);
        }
        else if(val>root.data)
        {
            search(val, root.right);
        }
       return 0;
   

    }

    public static void main(String[] args) {
        int data[]={30,10,20,40,35};
        node root=null;
        for(int i=0;i<data.length;i++)
        {
            root=create_bst(root, data[i]);

        }

        //searching 
        int ans=search(30, root);
        if(ans==1)
        {
            System.out.println("Key found!");
        }
        else{
            System.out.println("Key not found!");
        }

        delete(root, 30);
        inorder(root);
    }
    
}
;