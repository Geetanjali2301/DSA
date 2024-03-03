public class ocurrence {
    public static void occ(int arr[],int idx,int key)    
    {
        if(idx==arr.length)
        {
            return;
        }
        if(arr[idx]==key)
        {
            System.out.println(idx);
        }
        occ(arr,idx+1,key);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,2,4,2,5,7,2};
        occ(arr,0,2);
    }
}
