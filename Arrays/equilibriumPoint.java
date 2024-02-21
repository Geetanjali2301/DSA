public class equilibriumPoint {

    public static int equilibrium(int arr[])
    {
        int n=arr.length;
        int sum=0;
        int lsum=0;
        int rsum=0;
        

        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
       // System.out.println(sum);

        for(int i=0;i<n;i++)
        {
            sum-=arr[i];
            if(lsum==sum)
            {
                return i;
            }
            lsum+=arr[i];
           
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[]={-7, 1, 5, 2, -4, 3, 0};
        System.out.println(equilibrium(arr));
    }
    
}
