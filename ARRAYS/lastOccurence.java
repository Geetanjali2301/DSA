public class lastOccurence {

    public static void last(int arr[],int i,int key)
    {
        if(i==0)
        {
            System.out.println("Key not found");
            return;
        }
        if(arr[i]==key)
        {
            System.out.println("Last occurence is at: "+i);
            return;
        }
        last(arr,i-1,key);

    }


    public static void main(String[] args) {
        int arr[]={1,4,3,6,2,5,9,2,0};
        last(arr,arr.length-1,2);
    }
    
}
