public class transpose {

    public static void swap(int i,int j)
    {
        int temp=i;
        i=j;
        j=temp;
    }

    public static void print(int arr[][])
    {
        for(int i=0;i<=arr.length-1;i++)
        {
            for(int j=0;j<=arr.length-1;j++)
            {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,6},{8,5,1},{9,7,4}};
        int transpose[][]=new int[3][3];
        

        for(int i=0;i<=arr.length-1;i++)
        {
            for(int j=0;j<=arr.length-1;j++)
            {
                transpose[i][j]=arr[j][i];
            }

        }
        print(transpose);
    }
    
}
