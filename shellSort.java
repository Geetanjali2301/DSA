public class shellSort {

    public static void shell(int arr[])
    {
        int n=arr.length;
        //to track gap
        for(int gap=n/2;gap>=1;gap=gap/2)
        {
            //to track j ptr(rhs)
            for(int j=gap;j<n;j++)
            {
                //to track i ptr(lhs)
                for(int i=j-gap;i>=0;i=i-gap)
                {
                    if(arr[i+gap]>arr[i])
                    {
                        break;
                    }
                    else{
                        int temp=arr[i];
                        arr[i]=arr[i+gap];
                        arr[i+gap]=temp;
                    }
                }
            }


        }
    }

    public static void main(String[] args) {
        int arr[]={4,7,2,9,1,0,6};
        shell(arr);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
