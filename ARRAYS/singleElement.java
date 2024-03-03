//Find the element that occurs only once in the array and other all occurs twice
public class singleElement {

    public static void main(String[] args) {
        
        int arr[]={1,1,9,2,2,7,7,8,8,5,5};

        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            ans=ans^arr[i];
        }

        System.out.println("Single element is : "+ans);
    }
    
}
