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
        int n=6;
        for(int i=1;i<n;i++)
        {
            int space=5-i;
            
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            for(int j=5;j>space;j--)
            {
                System.out.print("*");
            }
           
            System.out.println();
            
        }
        
       
       
    }
    
}
