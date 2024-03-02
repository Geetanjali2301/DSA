import java.util.Scanner;

//TC O(logn)

public class xPowernOptimised {
    public static int Optimisedpower(int x,int n)
    {
        if(n==0)
        {
            return 1;

        }
        if(n%2!=0)
        {
            return x*Optimisedpower(x, n/2)*Optimisedpower(x, n/2);
        }
        return Optimisedpower(x, n/2)*Optimisedpower(x, n/2);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter n: ");
        int x=sc.nextInt();
        System.out.println("Enter power: ");
        int n=sc.nextInt();
        System.out.println("The power is: "+Optimisedpower(x,n));
    }
    
}
