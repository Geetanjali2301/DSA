//Find the ceiling value of given target value. i.i return the smallest value greater than equal to the target
public class ceil {

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
        return arr[start];
    }
    public static void main(String[] args) {
        int arr[]={3,5,7,9,10};
        int target=7;
        System.out.println("The ceil value is: "+ceil(arr,target));
    }
    
}
