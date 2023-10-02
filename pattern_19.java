/*
 
        *
      *   *
    *       *
  *           *
* * * * * * * * *  

*/
public class pattern_19 {
    public static void main(String[] args) 
    {
        int n=9;
        int os=4;
        int is=-1;
        

        for(int i=1;i<=n;i++)
        {

            if(i<=n/2)
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
            
               os--;
               is=is+2;
            }

            if(i==5)
            {
                for(int j=1;j<=n;j++)
               {
                System.out.print("* ");
               }
            }
        
            System.out.println();
        }

    }     
        
}

    
    

