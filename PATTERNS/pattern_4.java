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

        for(row=n;row>=1;row--)
        {
            for(col=1;col<=row;col++)
            {
             System.out.print("* ");
            }
            System.out.println();
        }
        
    }
    
}
