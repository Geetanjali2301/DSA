import java.util.ArrayList;
import java.util.*;

public class stackUsingArraylist {

    static int top=-1;
    static  ArrayList<Integer> s=new ArrayList<>(5);
    static Scanner sc=new Scanner(System.in);

    public static void push()
    {
        System.out.println("Enter element to push: ");
        int val=sc.nextInt();
        top++;
        s.add(val);

    }
    
    public static void pop()
    {
        if(top==-1)
        {
            System.out.println("underflow");
        }
       
        System.out.println("The poped element is: "+s.remove(top));
        top--;

    }

    public static void print()
    {
        for(int i=0;i<s.size();i++)
        {
            System.out.print(s.get(i)+" ");
        }
    }
  

    public static void main(String[] args) {
        int choice;
        boolean flag=true;

        do{
            System.out.println("Enter choice :");
            choice=sc.nextInt();

            switch(choice){
                case 1:
                push();
                break;

                case 2:
                pop();
                break;

                case 3:
                print();
                break;

                case 4:
                flag=false;
                break;
            }
        }
        while(flag==true);
        
    }
    
}
