import java.util.*;
public class perfectNum {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int temp=n;
        int sum=0;

        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        
        if(sum==temp)
        {
            System.out.println("The number is a perfect number");
        }
        else
        {
            System.out.println("The number is not a perfect number");
        }

        
    }
    
}
