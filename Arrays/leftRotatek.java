public class leftRotatek {

    public static void reverse(int arr[],int low,int high)
    {
        while(low<=high){

            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }

    }
    public static void main(String[] args) {
        int arr[]={2,4,5,7,8,9};
        int k=3;
        reverse(arr,0,k);
        reverse(arr,k+1,arr.length-1);
        reverse(arr,0,arr.length-1);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }




    }
    
}
