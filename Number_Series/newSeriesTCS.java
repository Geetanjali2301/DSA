import java.util.*;

// Series 1 2 1 3 2 5 3 7 5 11 8 13 13........(Combination of fibonacci and prime number)
public class newSeriesTCS {

    public static int nthfib(int n)
    {
        int a=0;
        int b=1;
        int c=0;
        for(int i=1;i<=n;i++)
        {
            c=a+b;
            a=b;
            b=c;
        }
        return a;
    }

    
    public static int nthPrime(int n)
    {
        int num=1, count=0, i;  
        while (count < n)  
        {  
            num=num+1;  
            for (i = 2; i <= num; i++)  
            {   
                //determines the modulo and compare it with 0   
                if (num % i == 0)   
                {  
                //breaks the loop if the above condition returns true  
                break;  
            }  
            }  
            if (i == num)  
            {  
            //increments the count variable by 1 if the number is prime  
            count = count+1;  
            }  
        }
        return num;  
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the position n: ");
        int n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println("The element at specified position is: "+nthPrime((n/2)));
            
        }
        else{
           System.out.println("The element at specified position is: "+nthfib((n/2)+1));
    
        }

    }
    
    
}
