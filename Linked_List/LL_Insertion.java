public class LL_Insertion {

    //creating blueprint of node
    class node{
        int data;
        node next;
        public node(int data)
        {
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

    public void insert_end(int data)
    {
        node nn=new node(data);
        if(head==null)
        {
            head=tail=nn;
            return;
        }
        else{
            node p=head;
            while(p.next!=null)
            {
                p=p.next;
            }
            p.next=nn;
            tail=nn;
        }

    }

    public void insert_pos(int data,int pos)
    {
        node nn=new node(data);
        node p=head;
        int i=0;
        while(i<pos-1)
        {
            p=p.next;
            i++;
        }

        nn.next=p.next;
        p.next=nn;
        

    }

    public void display(){
        node p=head;
        while(p!=null)
        {
            System.out.print(p.data+" ");
            p=p.next;
        }
    }

    public static void main(String[] args) {

        LL_Insertion ll=new LL_Insertion();
        ll.insert_begin(1);
        ll.insert_begin(2);
        ll.insert_end(3);
        ll.insert_begin(4);
        ll.insert_pos(100, 2);
        ll.display();
        
        
    }
    
}
