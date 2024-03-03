public class maxHeap {

    public static void heapify(int[] arr,int n,int i)
    {
        int largest=i;
        int l=2*i+1;
        int r=2*i+2;

        if(l<n && arr[l]>arr[largest])
        {
            largest=l;
        }

        if(r<n && arr[r]>arr[largest])
        {
            largest=r;
        }

        if(largest !=i )
        {
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;

            heapify(arr, n,largest);

        }
    }

    public static void buildheap(int[] arr,int n)
    {
        int start=n/2;
        for(int i=start;i>=0;i--)
        {
            heapify(arr, n, i);
        }

    }

    public static void print(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={4,10,3,5,1};
        int n=arr.length;
        buildheap(arr, n);
        print(arr);

    }
    
}
