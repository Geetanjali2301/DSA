import java.util.*;
public class decimal_to_anybase {

    public static int dec_to_any(int n, int base)
    {

        int num=0;
        int pow=1;
        while(n>0)
        {
            int rem=n%base;
            n/=base;
            num+=rem*pow;
            pow*=10;

        }
        return num;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the decimal number to convert: ");
        int n=sc.nextInt();
        System.out.println("Enter base to which it should be converted: ");
        int base=sc.nextInt();

        System.out.println("The number is: "+dec_to_any(n,base));

    }
    
}
