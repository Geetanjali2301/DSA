public class PalindromeLL {

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

    public node mid()
    {
        node fast=head;
		node slow=head;
		while(fast!=null && fast.next!=null)
		{
		  slow=slow.next;
		  fast=fast.next.next;
		}
		node mid=slow;
		return mid;
    }

    public void palindrome()
    {
        node midnode=mid();

        node prev=null;
        node curr=midnode;
        node next;

        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        node right=prev;
        node left=head;

        boolean flag=false;
        while(right!=null)
        {
            if(left.data==right.data)
            {
                flag=true;
            }
            right=right.next;
            left=left.next;
        }

        if(flag==true)
        {
            System.out.println("The LL is palindrome!");
        }
        else{
            System.out.println("Linked list is not palindrome!");
        }
    }

    public static void main(String[] args) {
        PalindromeLL n1=new PalindromeLL();
        n1.insert_begin(1);
        n1.insert_begin(2);
        n1.insert_begin(2);
        n1.insert_begin(1);

        //n1.reverse();
        n1.display();
        n1.palindrome();
        //n1.search(7);
        //System.out.println("The index of node is:  "+n1.recursive_search(2, head));
    }
    
}
