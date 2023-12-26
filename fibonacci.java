import  java.util.*;
public class fibonacci {

    public static int fib(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        int fibonacci=fib(n-1)+fib(n-2);
        return fibonacci;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        System.out.println(fib(n));

    }
    
}
