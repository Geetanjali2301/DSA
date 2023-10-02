/*

* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *

 */
public class pattern_18 {
    public static void main(String[] args) {
      int n=9;
      int space=0;
      int st=9;

      for(int i=1;i<=n;i++)
      {
        if(i<=n/2)
        {
          for(int j=1;j<=space;j++)
          {
            System.out.print("  ");
          }
          for(int j=1;j<=st;j++)
          {
            System.out.print("* ");
          }
          space++;
          st=st-2;
        }
        else
        {
          for(int j=1;j<=space;j++)
          {
            System.out.print("  ");
          }
          for(int j=1;j<=st;j++)
          {
            System.out.print("* ");
          }
          space--;
          st=st+2;
        }
        System.out.println();
      }
        
    }
    
}
