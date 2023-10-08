import java.util.*;
public class reverseOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n=sc.nextInt();
        int c=0;

        while(n!=0)
        {
            c=c*10+n%10;
            n/=10;
        }
        System.out.println("The reversed number is: "+c);
    }
    
}
