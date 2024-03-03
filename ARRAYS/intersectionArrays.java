public class intersectionArrays {

    public static void main(String[] args) {

        int a[]={1,2,6,7,9};
        int b[]={2,3,6,9};

        int i=0,j=0;
        while(i<a.length && j<b.length)
        {
            if(a[i]==b[j])
            {
                System.out.print(a[i]+" ");
                i++;
                j++;

            }
            else if(a[i]<b[j])
            {
                i++;
            }
            else if(b[j]<a[i])
            {
                j++;
            }
        }

    }
    
}
