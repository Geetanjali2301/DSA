//Kadanes Algorithm optimised approach for max subarray sum->> tc->>O(n)
public class maxSubarray {

    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        int max=Integer.MIN_VALUE;
        int currsum=0;

        for(int i=0;i<arr.length;i++)
        {
            currsum+=arr[i];
            if(currsum<0)
            {
                currsum=0;
            }
            max=Math.max(max, currsum);
        }
        System.out.println("Maximum subarray sum: "+max);
    }
    
}
