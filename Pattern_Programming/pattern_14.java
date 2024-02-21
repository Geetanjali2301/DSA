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

Logic->> maintain a count of stars that increases till half way and then decreases

*/

public class pattern_14 {
    public static void main(String[] args) {
        int n=9;
        int st=1;
        

        for(int i=1;i<=n;i++)
        {
            if(i<=n/2)
            {
               for(int j=1;j<=st;j++)
               {
                System.out.print("* ");
               }
               st++;
            }
            else{
                for(int j=1;j<=st;j++)
               {
                System.out.print("* ");
               }
               st--;
            }
            System.out.println();

        }
    }
    
}
