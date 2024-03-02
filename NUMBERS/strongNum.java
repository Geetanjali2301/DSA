import java.util.*;
public class strongNum {

    public static int fact(int n)
    {
        int res=1;
        for(int i=n;i>=1;i--)
        {
            res*=i;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number to check it is a strong number or not: ");
        int n=sc.nextInt();
        int temp=n;
        int c=0;

        while(n!=0)
        {
            c+=fact(n%10);
            n=n/10;
        }

        if(temp==c)
        {
            System.out.println("The number is strong number");
        }
        else{
            System.out.println("The number is not a strong number");
        }

        
    }
    
}
