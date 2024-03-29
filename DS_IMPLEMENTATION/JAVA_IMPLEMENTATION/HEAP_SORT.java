public class HEAP_SORT {

    public static void heapify(int[] arr,int n,int i)
    {
        int smallest=i;
        int lc=2*i+1;
        int rc=2*i+2;

        if(lc<n && arr[lc]<arr[smallest])
        {
            smallest=lc;
        }
        if(rc<n && arr[rc]<arr[smallest])
        {
            smallest=rc;
        }

        if(smallest!=i)
        {
            int temp=arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=temp;

            heapify(arr,n,smallest);
        }
    }

    public static int delete(int arr[],int n)
    {
        int last=arr[n-1];
        System.out.print(arr[0]+" ");
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
        int arr[]={10,5,2,9};
        int n=4;
        heapify(arr, n, 0);
        for(int i=0;i<arr.length;i++)
        {
            n=delete(arr, n);
        }
        
    }


    
}
