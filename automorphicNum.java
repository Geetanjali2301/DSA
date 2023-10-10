import java.util.*;
public class automorphicNum {
    public static int isAutomorphic(int n,int c)
    {
        int sq=n*n;
        int rem=0;
        for(int i=0;i<c;i++)
        {
            rem=rem*10+sq%10;
            sq/=10;
        }
        return rem;
    }
    public static int count(int n)
    {
        int c=0;
        while(n!=0)
        {
            c++;
            n/=10;
        }
        return c;
    }
    public static int rev(int n)
    {
        int c=0;

        while(n!=0)
        {
            c=c*10+n%10;
            n/=10;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check whether it is automorphic number of not: ");
        int n=sc.nextInt();
        int rev=rev(n);
        int ct= count(n);
        int rem=isAutomorphic(n,ct);
        System.out.println(rem+" "+rev);

        if(rem==rev)
        {
            System.out.println("It is a automorphic number");
        }
        else{
            System.out.println("Not an automorphic number");
        }
        
    }
    
}
