/* Print right_triangle pattern

*
* *
* * *
* * * *
* * * * *

Logic->> 
->> for nth row we need to print stars till n 
*/

public class pattern_2 {
    public static void main(String[] args) 
    {
        int n=5;
        for(int row=1;row<=n;row++)
    {
        for(int col=row;col>=1;col--)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
        
    }

    
    
}
