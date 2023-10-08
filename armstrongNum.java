import java.util.*;
public class armstrongNum {

    public static int power(int base,int exp)
    {
        int res=1;
        for(int i=1;i<=exp;i++)
        {
            res=res*base;
        }
        return res;
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
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number to check: ");
        int n=sc.nextInt();
        int temp=n;
        int c=0;
        int exp=count(n);

        while(n!=0)
        {
            c+=power(n%10,exp);
            n/=10;
        }

        if(temp==c)
        {
            System.out.println("The number is an armstrong number");
        }
        else
        {
            System.out.println("The number is not an armstrong number");
        }
    }
    
}
