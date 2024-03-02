import java.util.*;
public class GCD {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n1: ");
        int n1=sc.nextInt();
        System.out.println("Enter n2: ");
        int n2=sc.nextInt();

        System.out.println("The gcd of above two numbers is: "+gcd(n1,n2));
        
    }

    public static int gcd(int a,int b)
    {
        if(a==0)
        {
            return b;
        }
        return gcd(b%a,a);
    }
    
}
