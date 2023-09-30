/*

* * * * *
*       *
*       *
*       *
* * * * *

 */

public class pattern_13 {
    public static void main(String[] args) {
        int n=5;
        int os=0;
        int is=3;

        for(int i=1;i<=n;i++)
        {
            if(i>1 && i<n)
            {
            for(int j=1;j<=os;j++)
            {
                System.out.print(" ");
            }
            System.out.print("* ");
            for(int j=1;j<=is;j++)
            {
                System.out.print("  ");
            }
            System.out.print("* ");

            System.out.println();
            }
            else
            {
                for(int j=1;j<=n;j++)
                {
                    System.out.print("* ");
                }
                System.out.println();

            }
        }
    }
    
}
