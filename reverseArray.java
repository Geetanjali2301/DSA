public class reverseArray {

    public static void rev(int arr[])
    {
        int i=0;
        int j=arr.length-1;

        while(i<j)
        {
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;

            i++;
            j--;
        }
    }

    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6,7};

        rev(arr);
        System.out.println("The reversed array is: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
    
}
