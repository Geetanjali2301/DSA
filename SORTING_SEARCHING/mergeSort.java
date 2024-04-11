public class mergeSort {

    public static void conquer(int arr[],int l,int mid,int h)
    {
        int merge[]=new int[h-l+1];
        int i=l;
        int j=mid+1;

        int k=0;
        while(i<=mid && j<=h)
        {
            if(arr[i]>arr[j])
            {
               merge[k]=arr[j];
               k++;
               j++;
            }
            else{
                merge[k]=arr[i];
                k++;
                i++;
            }
            
        }

        while(i<=mid){
            merge[k++]=arr[i];
            i++;
        }

        while(j<=h){
            merge[k++]=arr[j];
            j++;
        }

        for(int p=0,s=l;p<merge.length;p++,s++)
        {
            arr[s]=merge[p];
        }
    }

    public static void print(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void divide(int arr[],int l,int h)
    {
        if(l>=h)
        {
            return;
        }
        int mid=l+(h-l)/2;
        divide(arr, l, mid);
        divide(arr, mid+1, h);
        conquer(arr,l,mid,h);
    }

    public static void main(String[] args) {
        int arr[]={4,6,2,1,9,3,5};
        divide(arr, 0, arr.length-1);
        print(arr);
    }
    
}
