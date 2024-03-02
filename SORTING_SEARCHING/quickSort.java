public class quickSort {
   
    public static void quick_sort(int arr[],int low,int high)
        {
            if(low<high)
            {
            int pivot=partition(arr,low,high);
            quick_sort(arr,low,pivot-1);
            quick_sort(arr,pivot+1,high);
            }
        }
    
    public static int partition(int arr[],int low,int high)
        {
            int pivot,i,j;
            pivot=arr[low];
            i=low;
            j=high;
    
            while(i<j)
            {
                while(arr[i]<pivot)
                {
                    i++;
                }
                while(arr[j]>pivot)
                {
                    j--;
    
                }
                if(i<j)
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
    
            }
            int temp=pivot;
            pivot=arr[j];
            arr[j]=temp;
    
            return pivot;
        }
    
    public static void main(String[] args) {
    
            int arr[]={5,8,2,0,4,1,9};
            int n = arr.length;
    
            quick_sort(arr,0,n-1);
    
            System.out.println("The sorted array is: ");
            {
                for(int i=0;i<n;i++)
                {
                    System.out.print(arr[i]+" ");
                }
            }
    
        }
}
    
    
    

    
    

