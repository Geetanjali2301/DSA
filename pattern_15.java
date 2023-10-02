/*
 
        *
      * *
    * * *
  * * * *
* * * * *
  * * * *
    * * *
      * *
        *


Logic->> maintain count of outer space and the count of stars for each row

*/


public class pattern_15 {
    public static void main(String[] args) {
        int st=1;
        int n=9;
        int os=4;

        for(int i=1;i<=n;i++)
        {
            if(i<=n/2)
            {
                for(int j=1;j<=os;j++)
                {
                    System.out.print("  ");
                }
                for(int j=1;j<=st;j++)
                {
                    System.out.print("* ");
                }

                st++;
                os--;
            }
            else
            {
                for(int j=1;j<=os;j++)
                {
                    System.out.print("  ");
                }
                for(int j=1;j<=st;j++)
                {
                    System.out.print("* ");
                }

                st--;
                os++;

            }
            System.out.println();
        }
    }
    
}
