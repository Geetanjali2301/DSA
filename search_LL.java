public class search_LL {

    class node{
        int data;
        node next;

        public node(int data){
            this.data=data;
            this.next=null;

        }
    }
    public static node head;
    public static node tail;

    public void insert_begin(int data)
    {
        node nn=new node(data);
        if(head==null)
        {
            head=tail=nn;
            return;
        }
        else{
            nn.next=head;
            head=nn;
        }
    }

    public void display(){
        node p=head;
        while(p!=null)
        {
            System.out.print(p.data+" ");
            p=p.next;
        }
    }

    public void search(int key){
        node p=head;
        boolean flag=false;
        while(p!=null)
        {
            if(p.data==key){
                flag=true;
            }
            p=p.next;
        }
        if(flag==true){
            System.out.println("The key is found!");
        }
        else
        {
            System.out.println("Key not found!");
        }
    }

    public int recursive_search(int key,node head){
        if(head==null)
        {
            return -1;
        }
        if(head.data==key)
        {
            return 0;

        }
        int idx=recursive_search(key, head.next);
        if(idx==-1)
        {
            return -1;
        }

        return idx+1;
    }

    public void reverse()
    {
        node prev=null;
        node curr=tail=head;
        node next;
        
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;

    }


    public static void main(String[] args) {
        search_LL n1=new search_LL();
        n1.insert_begin(1);
        n1.insert_begin(2);
        n1.insert_begin(3);
        n1.insert_begin(4);

        n1.reverse();
        n1.display();
        //n1.search(7);
        //System.out.println("The index of node is:  "+n1.recursive_search(2, head));

        





        
    }
    
}
