public class selectionSort {

    public static void print(int arr[])
    {
        System.out.println("Elements are: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void selection(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int min=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }

            }
            if(min!=i)
            {
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={3,2,5,1,8,4};
        selection(arr);
        print(arr);
    }
    
}
