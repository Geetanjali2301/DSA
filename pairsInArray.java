public class pairsInArray {
    public static void main(String[] args) {

        int arr[]={1,3,5,4,7,8,9};
        int n=arr.length;

        System.out.println("The all possible pairs are: ");

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }
    }
    
}
