/* Print z pattern

* * * * *
      *    
    *
  *
* * * * *   

Logic->> 
->> for 1st and last row print *
->> then print the diagonals using logic of sumation i.e row+col=n
->> else print space 
*/

public class pattern_3 {

    public static void main(String[] args) 
    {

        for(int row=0;row<5;row++)
    {
        for(int col=0;col<5;col++)
        {
            if(row==0 || row==4)
            {
                System.out.print("* ");
                
            }
            else if(row+col==4)
            {
                System.out.println("*");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
        
    }
    
    
}
