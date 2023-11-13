public class trappinWater {
    public static void main(String[] args) {
        int arr[]={4,2,0,6,3,2,5};
        int n=arr.length;
        
        int left_bound[]=new int[n];
        int right_bound[]=new int[n];

        left_bound[0]=arr[0];
        right_bound[n-1]=arr[n-1];


        for(int i=1;i<n;i++)
        {
            left_bound[i]=Math.max(arr[i],left_bound[i-1]);
            
        }

        for(int i=n-2;i>=0;i--)
        {
            right_bound[i]=Math.max(arr[i],right_bound[i+1]);
            
        }

        int water_trapped=0;

        for(int i=0;i<n;i++)
        {
            water_trapped+=Math.min(right_bound[i],left_bound[i])-arr[i];
        }
    
       System.out.println("The water trapped= "+water_trapped+" units");
       

    }
    
}
