public class spiralMatrix {

    public static void print_spiral(int arr[][])
    {
        //Step 1 is to define starting and ending values of columns and rows
        int srow=0;
        int scol=0;
        int erow=arr.length-1;
        int ecol=arr.length-1;

        //Step 2 is to print the top,right,bottom,left boundaries continuously

        //<=so that to cover the last remaining element in case of odd matrix size
        while(srow<=erow && scol<=ecol)
        {
            //top boundary (column is variable)
            for(int j=scol;j<=ecol;j++)
            {
                System.out.print(arr[srow][j]+" ");
            }

            //right boundary (row is variable)
            for(int i=srow+1;i<=erow;i++)
            {
                System.out.print(arr[i][ecol]+" ");
            }

            //bottom boundary (col is variable)
            for(int j=ecol-1;j>=scol;j--)
            {
                if(scol==ecol)
                {
                    break;
                }
                System.out.print(arr[erow][j]+" ");
            }

            //left boundary (row is variable)
            for(int i=erow-1;i>=srow+1;i--)
            {
                if(srow==erow)
                {
                    break;
                }
                System.out.print(arr[i][scol]+" ");
            }

        srow++;
        erow--;
        scol++;
        ecol--;

        }
        

    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        print_spiral(arr);
    }
    
}
