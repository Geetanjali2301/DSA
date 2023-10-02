/*
 
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *



*/
public class pattern_16 {
    public static void main(String[] args) {
      int n=9;
      int st=1;
      int space=4;

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
          st=st+2;
          space--;
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
          st=st-2;
          space++;
        }
        System.out.println();

      }

      

        
    }
    
}
