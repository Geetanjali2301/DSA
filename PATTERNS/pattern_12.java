/*

        * * * * *
      *       *
    *       *
  *       *
* * * * *

 */
public class pattern_12 {
    public static void main(String[] args) {
        int n=5;
        int is=3;
        int os=3;
        for(int i=1;i<=n;i++)
        {
            if(i>1 && i<n)
            {
               for(int j=1;j<=os;j++)
               {
                System.out.print("  ");
               }
               System.out.print("* ");

               for(int j=1;j<=is;j++)
               {
                System.out.print("  ");
               }
               System.out.print("* ");

               os--;

            }
            else
            {
                int space=n-i;
                for(int j=1;j<=space;j++)
                {
                    System.out.print("  ");
                }
                for(int j=1;j<=n;j++)
                {
                    System.out.print("* ");
                }
                
            }
            System.out.println();
            
        }
    
    }
}
