import java.util.*;

public class maxminNum_array {

    public static int maximum(int arr[])
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;

    }
    public static int minimum(int arr[])
    {
        int min=Integer.MAX_VALUE;
         for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;

    }

    public static void main(String[] args) {

        int arr[]={100,789,34,517,907,654,221};

        System.out.println("The maximum number in array is: "+maximum(arr));
        System.out.println("The minimum number in array is: "+minimum(arr));
    }
    
}
