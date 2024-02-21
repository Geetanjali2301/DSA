//Permute two arrays such that sum of every pair is greater or equal to K

import java.util.Arrays;


public class permuteArray {

    public static boolean permute(int a[],int b[])
    {
        Arrays.sort(a);
        Arrays.sort(b);

        for(int i=0,j=b.length-1;i<a.length && j>=0;i++,j--)
        {
            if(a[i]+b[j]>=10)
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int a[]={2,1,3};
        int b[]={7,9,8};

        boolean ans=permute(a,b);
        if(ans==true)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        
    }
    
}
