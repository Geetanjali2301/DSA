//return an array that displays the chances of winning of a n player that played n matches
import java.util.*;
public class winningPlayer {

    public static int[] predict()
    {
        int n=3;
        int status[][]={{0,0,1},{0,1,2},{2,1,0}};
        int ans[]=new int[n];

        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=0;j<n;j++)
            {
                sum+=status[i][j];
                
            }
            ans[i]=sum;
        }

        int max=ans[0];
        for(int i=0;i<n;i++)
        {
            if(ans[i]>max)
            {
                max=ans[i];
            }
        }

        for(int i=0;i<n;i++)
        {
            if(ans[i]==max)
            {
               ans[i]=1;
            }
            else
            {
                ans[i]=0;
            }
        }

    
        return ans;

    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int answer[]=predict();
        for(int i:answer)
        {
            System.out.print(i+" ");
        }
        
    }

   
    
}
