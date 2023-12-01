public class searchRoatedSorted {

    public static int bs(int low,int high,int key,int arr[])
    {
        if(low>high)
        {
            return -1;
        }

        int mid=0;
        while(low<high)
        {
            mid=(low+high)/2;

            if(arr[mid]==key)
            {
                return mid;
            }

            //first subarray sorted
            if(arr[low]<=arr[mid])
            {
             if(key<=arr[mid] && key>=arr[low])
             {
                return bs(low, mid-1, key, arr); //search in left
             }
             else{
                return bs(mid+1, high, key, arr);
             }
            }

            //case 2 where key is greater than the mid one
            if(key>=arr[mid])
            {
                if(key<=arr[high]&& key>=arr[mid+1])
                {
                    return bs(mid+1, high, key, arr);
                }
                else
                {
                    return bs(low, mid-1, key, arr);
                }

            } 
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={30,40,50,10,20};
        System.out.println(bs(0, arr.length-1, 50, arr)); 
    }
    
}
