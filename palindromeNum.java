import java.util.*;
public class palindromeNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number to check: ");
        int n=sc.nextInt();
        int c=0;
        int temp=n;

        while(n!=0)
        {
            c=c*10+n%10;
            n/=10;
        }

        if(temp==c)
        {
            System.out.println("The number is a palindrome number");
        }
        else
        {
            System.out.println("The number is not a palindrome number");

        }

    }
    
}
