import java.util.*;
public class neonNum {
    public static void isNeon(int n)
    {
        int sq=n*n;
        int c=0;

        while(sq!=0)
        {
            c+=sq%10;
            sq/=10;
        }
        
        if(c==n)
        {
            System.out.println("It is a neon number");
        }
        else
        {
            System.out.println("It is not a neon number");
        }
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check whether it is a neon number or not: ");
        int n=sc.nextInt();
        isNeon(n);
        
    }
    
}
