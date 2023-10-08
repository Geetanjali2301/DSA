import java.util.Scanner;
public class sumOfDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int c=0;

        while(n!=0)
        {
            c+=n%10;
            n/=10;
        }

        System.out.println("Sum of digits in number is: "+c);
        
    }
    
}
