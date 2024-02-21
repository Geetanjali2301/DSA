import java.util.*;

/*

     1 
    2 2 
   3 3 3 
  4 4 4 4 
 5 5 5 5 5 
6 6 6 6 6 6 

 */
public class pattern_30 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int space=n-i;
            
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            for(int j=n;j>space;j--)
            {
                System.out.print(i+" ");
            }
           
            System.out.println();
            
        }
        
    }
    
}
