/*

* * * * *
  * * * *
    * * *
      * * 
        *   


Logic ->> If my current col>=row I need to print star else space
        
*/

public class pattern_5 {
    public static void main(String[] args) {
        int n=5;
        int row,col;

        for(row=0;row<n;row++)
        {
            for(col=0;col<n;col++)
            {
               if(col>=row){
                System.out.print("* ");
               }
               else{
                System.out.print("  ");
               }
            }
            System.out.println();
        }
    }
    
}
