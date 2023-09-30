/*
        * 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * *

Logic->> No. of stars present in a row= (2*row)-1
     
*/

public class pattern_9 {
    
    public static void main(String[] args) {
    
        int n=5;
        int space=n-1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=space;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=(2*i)-1;j++)
            {
               System.out.print("* ");
            }
            
            space--;
            System.out.println();
        }
        
    }
    
}
