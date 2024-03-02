import java.util.*;
public class sumN {

    
    public static int sum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        int sum=n+sum(n-1);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.println("Sum till first "+n+" natural numbers is: "+sum(n));


    }
    
}
