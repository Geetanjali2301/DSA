import java.util.*;
public class linearSearch {

    public static int linear_search(int arr[],int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
               return i;
            }
        }

       return -1;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int arr[]={23,45,12,90,8,65,41,73,100};

        System.out.println("Enter an element to search: ");
        int key=sc.nextInt();
        
        int idx=linear_search(arr,key);

        if(idx==-1)
        {
            System.out.println("Key not found");
        }
        else
        {
            System.out.println("Key found at index: "+idx);
        }
    }
    
}
