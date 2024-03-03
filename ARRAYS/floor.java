public class floor {
    public static int ceil(int arr[],int target)
    {
        int start=0;
        int end=arr.length-1;

        while(start<=end)
        {
            int mid=(end-start)/2+start;
            if(arr[mid]==target)
            {
                return arr[mid];
            }
            else if(arr[mid]>target)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return arr[end];
    }
    public static void main(String[] args) {
        int arr[]={3,5,7,9,10};
        int target=8;
        System.out.println("The floor value is: "+ceil(arr,target));
    }
    
}
