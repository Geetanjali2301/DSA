/* Print left_triangle pattern

     *
    **
   ***
  ****
 ***** 

Logic->> Adding n-row number of spaces

*/
public class pattern_1 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            int space=n-i;
            
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            for(int j=n;j>space;j--)
            {
                System.out.print("*");
            }
           
            System.out.println();
            
        }
    
    }
    
}
