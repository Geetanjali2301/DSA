//Find the leader element whose elements to the right are smaller than the current
public class leadersinArray {

    public static void printLeaders(int arr[])
    {
        int n=arr.length;
        if(n==1)
        {
            System.out.print(arr[0]+" ");
            return;
        }
        else
        {
            int maxsofar=arr[n-1];
            for(int i=n-1;i>=0;i--)
            {
                if(i==n-1)
                {
                    System.out.print(arr[i]+" ");
                }
                else
                {
                    
                    if(arr[i]>maxsofar)
                    {
                        maxsofar=arr[i];
                        System.out.print(maxsofar+" ");
                    }

                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={10,5,15,20,25,1,14,13,20};
        printLeaders(arr);

       
    }
    
}
