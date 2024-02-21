import java.util.*;
public class primeRange {

    public static boolean isPrime(int n)
    {
        if(n==1 || n==0)
        {
            return false;
        }
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter start: ");
        int n1=sc.nextInt();
        System.out.println("Enter end of range: ");
        int n2=sc.nextInt();

        System.out.println("Prime numbers are: ");

        for(int i=n1;i<=n2;i++)
        {
            if(isPrime(i))
            {
                System.out.println(i+" ");
            }
        }
    }
    
}
