public class buySellStocks {

    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        int n=arr.length;

        int max=0;
        int bp=Integer.MAX_VALUE;
        int profit=0;

        for(int i=0;i<n;i++)
        {
            if(bp<arr[i])
            {
                profit=arr[i]-bp;
                max=Math.max(max, profit);
            }
            else
            {
                bp=arr[i];
            }
        }

       
        System.out.println("Max profit is of Rs: "+max);
}}
