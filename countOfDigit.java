import java.util.*;
public class countOfDigit {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n=sc.nextInt();
        int c=0;

        while(n!=0)
        {
            c++;
            n/=10;
        }

        System.out.println("The number of digits are: "+c);


        
        
    }
    
}
