import java.util.Scanner;

public class anybase_to_anybase {

    public static int anyb_to_anyb(int num_b,int n,int convert_b)
    {
        int num=0;
        int pow=1;
        if(num_b>convert_b)
        {
            while(n>0)
            {
                int rem=n%convert_b;
                n/=convert_b;
                num+=rem*pow;
                pow*=10;

            }

        }
        else
        {
            while(n>0)
            {
                int rem=n%10;
                n/=10;
                num+=rem*pow;
                pow*=num_b;

            }

        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base of number: ");
        int num_b=sc.nextInt();
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        System.out.println("Enter the base to which it should be converted: ");
        int convert_b=sc.nextInt();

        System.out.println("The converted number is: "+anyb_to_anyb(num_b,n,convert_b));

    }
    
}
