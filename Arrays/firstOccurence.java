public class firstOccurence {

    public static void first(int arr[],int i,int key)
    {
        if(i==arr.length-1)
        {
            System.out.println("Key not found is array");
            return;
        }
        if(arr[i]==key)
        {
            System.out.println("First occurence is at: "+i);
            return;
        }
        first(arr,i+1,key);

    }

    public static void main(String[] args) {
        int arr[]={1,4,3,6,2,5,9,2,0};
        first(arr,0,2);
    }
    
}
