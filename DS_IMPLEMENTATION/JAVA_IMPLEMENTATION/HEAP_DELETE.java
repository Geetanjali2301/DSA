public class HEAP_DELETE {

    public static void heapify(int[] arr,int n,int i)
    {
        int largest=i;
        int lc=2*i+1;
        int rc=2*i+2;

        if(lc<n && arr[lc]>arr[largest])
        {
            largest=lc;
        }
        if(rc<n && arr[rc]>arr[largest])
        {
            largest=rc;
        }

        if(largest!=i)
        {
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;

            heapify(arr,n,largest);
        }
    }

    public static int delete(int arr[],int n)
    {
        int last=arr[n-1];
        arr[0]=last;
        n=n-1;
        heapify(arr, n, 0);
        return n;
    }

    public static void print(int[] arr,int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={10,5,3,2,4};
        int n=arr.length;
        n=delete(arr,n);
        print(arr,n);
    }
    
}
