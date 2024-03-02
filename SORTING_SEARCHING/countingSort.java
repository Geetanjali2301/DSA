public class countingSort {

    public static void countSort(int arr[])
    {
        //first find the maximum element in the array 
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }

        }

        int ans[]=new int[max+1];

        //now traverse array to get frequency of each different numbers in the array
        for(int i=0;i<arr.length;i++)
        {
            ans[arr[i]]++;
        }

        //now traverse the count array to print the actual sorted array
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            while(ans[i]>0)
            {
                arr[j]=i;
                j++;
                ans[i]--;
            }
        }

    }

    public static void main(String[] args) {

        int arr[]={4,7,3,2,5,1,1,4};
        countSort(arr);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
    
}
