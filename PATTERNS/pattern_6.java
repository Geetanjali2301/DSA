/*
    *
  * * *
* * * * * 
  * * *
    *


Logic ->> 
spaces vs stars
  2         1
  1         3
  0         5
  1         3
  2         1

spaces before n/2 row decreasing and then increasing 
stars before n/2 value increasing and then decreasing by 2
        
*/

public class pattern_6 {
    public static void main(String[] args) {
        int n=5;
        int space=n/2;
        int star=1;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=space;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=star;j++)
            {
                System.out.print("* ");
            }

            if(i<=n/2){
                space--;
                star=star+2;
            }
            else{
                space++;
                star=star-2;
            }
            System.out.println();
        }
        
    }
    
}
