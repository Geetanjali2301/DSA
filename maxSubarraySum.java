//Brute force approach ->> complexity(O(n^3))

public class maxSubarraySum {
    public static void main(String[] args) {
        
        int arr[]={2,4,5,7,8};
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        System.out.println("Subarrays sum are:");

        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int currsum=0;
                for(int k=i;k<=j;k++)
                {
                    currsum+=arr[k];
                }
                System.out.println(currsum);

                if(currsum>max)
                {
                    max=currsum;
                }
              
            }
            System.out.println();
        }

        System.out.println("The maximum sum is: "+max);
    }
    
}
