import java.util.HashSet;

//return true if array has duplicates
public class duplicate {

    public static boolean dup(int arr[])
    {
        HashSet<Integer> hs=new HashSet<Integer>();

        for(int i=0;i<arr.length;i++)
        {
            if(hs.contains(arr[i])){
                return true;
            }
            else{
                hs.add(arr[i]);
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int arr[]={1,1,2,5,6,1,8,9,3,3,2};
        System.out.println(dup(arr));  
    }
    
}
