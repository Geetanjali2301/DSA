import java.util.ArrayList;
//State whether an array is monotonic or not

public class isMonotonic {

    public static boolean isMonotonic(ArrayList<Integer> arr)
    {
        boolean inc=true;
        boolean dec=true;

        for(int i=0;i<arr.size()-1;i++)
        {
            if(arr.get(i)>arr.get(i+1))
            {
                inc=false;
            }
            else if(arr.get(i)<arr.get(i+1))
            {
                dec=false;
            }

        }

        return inc||dec;

    }

    public static void main(String[] args) {
        ArrayList<Integer> n=new ArrayList<>();
        n.add(1);
        n.add(2);
        n.add(8);
        n.add(4);

        System.out.println(isMonotonic(n));
        
    }
    
}
