import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class chocolateDistribution {

    public static void main(String[] args) {
        int arr[]={3,1,4,9,12,7,9,56,78};
        int m=5;
        int n=arr.length;

        int mindif=Integer.MAX_VALUE;
        if(n<m)
        {
            return;
        }
        else if(m==0 || n==0)
        {
            return;
        }
        else
        {
            Arrays.sort(arr);
            for(int i=0;i<n;i++)
            {
                for(int j=i+m-1;j<n;j++)
                {
                    if(arr[j]-arr[i]<mindif)
                    {
                        mindif=arr[j]-arr[i];
                    }

                }
            }

        }

        System.out.println("Min diff: "+mindif);
    }
    
}
