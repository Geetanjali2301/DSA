/*

        * * * * *
      * * * * *
    * * * * *
  * * * * *
* * * * *

 */
public class pattern_11 {
    public static void main(String[] args) {
        int n=5;
        int space;
        for(int i=1;i<=n;i++)
        {
            space=n-i;
            for(int j=1;j<=space;j++)
            {
                System.out.print("  ");
            }

            for(int j=1;j<=n;j++)
            {
                System.out.print("* ");
            }

            space--;
            System.out.println();
        }
    }
    
}
