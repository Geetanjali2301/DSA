public class bubbleSort {

    public static void print(int arr[])
    {
        System.out.println("Elements are: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void bubble_sort(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int arr[]={9,4,3,1,7,0,6};
        bubble_sort(arr);
        print(arr);
        
    }
    
}
