/*

* * * * *
* * * *
* * *
* * 
*  

Logic ->> Start printing stars backwards from  (col-row) column to starting column

*/
public class pattern_4 {
    public static void main(String[] args) {
        int n=5;
        int row,col;

        for(row=0;row<n;row++)
        {
            for(col=n-1;col>=0;col--)
            {
                for(col=col-row;col>=0;col--)
                {
                    System.out.print("* ");
                }
               
            }
            System.out.println();
        }
        
    }
    
}
