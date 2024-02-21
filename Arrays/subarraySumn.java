//O(n) time complexity
import java.util.*;
public class subarraySumn {

    public static int subarrayRange(int arr[],int target)
    {
        int sum=arr[0];
        int i=0;
        int j=0;

        while(i!=arr.length || j!=arr.length)
        {
            if(sum==target)
            {
                System.out.println("Range is: "+i+","+j);
                break;

            }
            else if(sum<target)
            {
                if(j<arr.length)
                {
                    j++;
                    sum+=arr[j];

                }
                else{
                    System.out.println("No subarray found!");
                    break;
                }
               
            }
            else
            {
                sum-=arr[i];
                i++;
            }
            
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        System.out.println("Enter target: ");
        int target=sc.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        subarrayRange(arr,target);
    }
    
}
