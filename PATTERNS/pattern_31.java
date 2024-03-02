/*
  1  2  3  4  16  17  18  19 
     5  6  7  13  14  15    
        8  9  11  12       
           10 
 */
public class pattern_31 {
    public static void main(String[] args) {

        int n=4;
        int c=1;
        int space=0;
        int os=0;
        int star=(n*2)-1;
        int newct=0;

        for(int i=0;i<n;i++)
        {
           for(int j=0;j<space;j++)
           {
               System.out.print("   ");
            }
           for(int j=i;j<=star;j++)
           {

                if(j<n)
                {
                    System.out.print(" "+c+" ");
                    newct=c;
                    c++;
                }
                else if(i!=n-1)
                {
                    c--;
                    System.out.print(" "+(20-c)+" ");
                }
           }

           for(int j=0;j<os;j++)
           {
               System.out.print("   ");
           }

           c=newct+1;
           os++;
           star--;
           space++;
           System.out.println();
        }


    }
    
}
