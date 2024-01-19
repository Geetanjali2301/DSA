public class subarraySum {
    public static void main(String[] args) {
        int arr[]={1,4,0,0,3,10,5};
        int target=7;
        

        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            int j=i;
            while(j<arr.length)
            {
                sum+=arr[j];
                if(sum==target)
                {
                    System.out.println(i+","+j);
                    return;
                        
                }
                else if(sum>target)
                {
                    break;
                }
                j++;
               
                 
            }
           
        }
    }
    
}
