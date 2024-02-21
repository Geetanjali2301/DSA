import java.util.*;
public class anybase_to_decimal {

    public static int dec_to_any(int n, int base)
    {
        int num=0;
        int pow=1;
        while(n>0)
        {
            int rem=n%10;
            n/=10;
            num+=rem*pow;
            pow*=base;

        }
        return num;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base of number: ");
        int base=sc.nextInt();
        System.out.println("Enter the number to convert: ");
        int n=sc.nextInt();

        System.out.println("The decimal number is: "+dec_to_any(n,base));

    }
    
}
