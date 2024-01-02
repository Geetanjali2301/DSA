import java.util.ArrayList;
import java.util.Collections;

//Check whether any number ia a lonely number
public class isLonely {

    public static ArrayList<Integer> lonely(ArrayList<Integer> n)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        Collections.sort(n);

        for(int i=0;i<n.size();i++)
        {
            if(i==0 && n.get(i+1)!=n.get(i)+1 &&  n.get(i+1)!=n.get(i))
            {
                ans.add(n.get(i));
            }
            else if(i==n.size()-1 && n.get(i-1)!=n.get(i)-1 && n.get(i-1)!=n.get(i) )
            {
                ans.add(n.get(i));

            }
            else if(n.get(i+1)!=n.get(i)+1 && n.get(i-1)!=n.get(i)-1 && n.get(i+1)!=n.get(i) && n.get(i-1)!=n.get(i))
            {
                ans.add(n.get(i));

            }
        }
       
        return ans;
    }

   public static void main(String[] args) {
    ArrayList<Integer> n=new ArrayList<>();
    n.add(1);
    n.add(3);
    n.add(5);
    n.add(3);
   
    System.out.println(lonely(n));
   }
    
}
