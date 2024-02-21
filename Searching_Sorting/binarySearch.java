import java.util.*;
public class binarySearch {

    public static int binary_search(int arr[],int key){
        int low=0;
        int high=arr.length-1;
        
        while(low<=high)
        {
            int mid=((high-low)/2)+low;
            if(arr[mid]==key)
            {
                return mid;
            }
            else if(arr[mid]>key)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            } 
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arr[]={1,45,65,76,87,97,900};

        System.out.println("Enter key to search: ");
        int key=sc.nextInt();

        int idx=binary_search(arr, key);

        if(idx==-1)
        {
            System.out.println("Key not found");
        }
        else
        {
            System.out.println("key found at index: "+idx);
        }

    }
    
}
