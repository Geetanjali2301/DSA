import java.util.ArrayList;

public class nextGreaterElement {

    public static void main(String[] args) {

    ArrayList<Integer> ans=new ArrayList<>();
    int arr[]={6,8,0,1,3};

    for(int i=0;i<arr.length;i++)
    {
        int j=i+1;
        while(j<arr.length)
        {
            if(arr[j]>arr[i])
            {
                ans.add(arr[j]);
                break;
            }
            
            j++;

            if(j==arr.length-1)
            {
                ans.add(-1);
            }
               
        }
        if(i==arr.length-1)
        {
            ans.add(-1);
        }
    }

    System.out.println(ans);
         
    }

    

    
}
