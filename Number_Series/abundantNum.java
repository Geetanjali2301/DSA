import java.util.*;
public class abundantNum {
    public static void isAbundant(int n)
    {
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        if(sum>n)
        {
            System.out.println("It is an abundant number");
        }
        else
        {
            System.out.println("It is not an abundant number");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check whether it is abundant number of not: ");
        int n=sc.nextInt();
        isAbundant(n);
    }
    
}
