//Preorder, postorder and inorder traversals in tree

import java.util.LinkedList;
import java.util.Queue;

public class treeTraversals {

    class node
    {
        int data;
        node right;
        node left;

        public node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;

        }
        
    }

    public void inorder(node root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public void preorder(node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public void postorder(node root)
    {
        if(root==null)
        {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public void levelorder(node root)
    {
        if(root==null)
        {
            return;
        }
        Queue<node> q=new LinkedList();
        q.add(root);

        while(!q.isEmpty())
        {
            node curr=q.remove();
            System.out.print(curr.data+" ");
            if(curr.left!=null)
            {
                q.add(curr.left);
            }
            if(curr.right!=null)
            {
                q.add(curr.right);
            }

        }
            
        };
    
    public static void main(String[] args) {
        treeTraversals t=new treeTraversals();
        node root=t.new node(10);
        root.left=t.new node(20);
        root.right=t.new node(30);
        root.left.left=t.new node(12);
        root.left.right=t.new node(13);
        root.right.left=t.new node(5);
        root.right.right=t.new node(50);
        t.inorder(root);
        System.out.println("\n");
        t.preorder(root);
        System.out.println("\n");
        t.postorder(root);
        System.out.println("\n");
        t.levelorder(root);



    }   
}
