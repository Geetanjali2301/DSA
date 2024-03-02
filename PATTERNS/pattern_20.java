/*
 
* * * * * * * * * 
  *           *
    *       *
      *   *
        * 

*/
public class pattern_20 {
    public static void main(String[] args) {

        int n=5;
        int os=1;
        int is=5;

        for(int i=1;i<=n;i++)
        {

        if(i>1)
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

            if(is!=-1)
            {
                System.out.print("* ");
            }

            os++;
            is=is-2;

        }
        else
        {
            for(int j=1;j<=9;j++)
            {
                System.out.print("* ");
            }

        }
        System.out.println();
           
        }
 
    }
    
}
