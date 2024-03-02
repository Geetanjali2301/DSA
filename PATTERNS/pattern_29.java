/*

butterfly pattern

*    *
**  **
******
******
**  **
*    *

 */

import java.util.Scanner;

public class pattern_29
{
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n: ");
    int n=sc.nextInt();
    int space=n-2;
    int outstar=1;
    int instar=1;

    for(int i=1;i<=n;i++)
        {

            if(i<=n/2)
                {
                    for(int j=1;j<=outstar;j++)
                    {
                        System.out.print("*");
                    }
                    for(int j=1;j<=space;j++)
                    {
                        System.out.print(" ");
                    }
                    for(int j=1;j<=instar;j++)
                    {
                        System.out.print("*");
                    }

                    space-=2;
                    outstar+=1;
                    instar+=1;


                }
            else
                {
                    space+=2;
                    outstar-=1;
                    instar-=1;
                    for(int j=1;j<=outstar;j++)
                    {
                        System.out.print("*");
                    }
                    for(int j=1;j<=space;j++)
                    {
                        System.out.print(" ");
                    }
                    for(int j=1;j<=instar;j++)
                    {
                        System.out.print("*");
                    }
                }
                System.out.println();
        }
         
}
}
