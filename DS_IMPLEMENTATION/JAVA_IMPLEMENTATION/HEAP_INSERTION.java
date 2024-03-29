public class HEAP_INSERTION {

    public static void heapify(int[] arr,int n,int i)
    {
        int parent=(i-1)/2;
        if(parent>=0)
        {
            if(arr[i]>arr[parent])
            {
                int temp=arr[i];
                arr[i]=arr[parent];
                arr[parent]=temp;

                heapify(arr, n, parent);
            }
        }
    }

    public static int insert(int[] arr,int n,int key)
    {
        n=n+1;
        arr[n-1]=key;
        heapify(arr, n, n-1);
        return n;
    }

    public static void print(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int max=1000;
        int[] arr=new int[max];


        arr[0]=10;
        arr[1]=5;
        arr[2]=3;
        arr[3]=2;
        arr[4]=4;
        int n=5;
       
        n=insert(arr,n,15);
        n=insert(arr, n, 12);
        print(arr,n);
    }
    
}
