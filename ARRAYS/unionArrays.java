public class unionArrays {

    public static void main(String[] args) {
        int a[]={1,2,6,7,9};
        int b[]={3,5,6,8};

        int i=0,j=0;

        while(i<a.length && j<b.length)
        {
            if(a[i]<b[j])
            {
                System.out.print(a[i]+" ");
                i++;
            }
            else if(a[i]>b[j])
            {
                System.out.print(b[j]+" ");
                j++;
            }
            else if(a[i]==b[j])
            {
                System.out.print(a[i]+" ");
                i++;
                j++;
            }

        }
       
    }
    
}
