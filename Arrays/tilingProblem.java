import java.util.*;
public class tilingProblem {

    public static int tiling(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        int vertical=tiling(n-1);
        int horizontal=tiling(n-2);

        return vertical+horizontal;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n dimension: ");
        int n=sc.nextInt();
        System.out.println("The number of ways in which tile can be passed is: "+tiling(n));
    }
    
}
