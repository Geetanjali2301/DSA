import java.util.*;
public class factorialN {

    public static int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }

        int factorial=n*fact( n-1);
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.println("Factorial is: "+fact(n));
    }
    
}
