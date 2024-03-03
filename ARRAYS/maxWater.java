//given an arraylist find the max amt of water stored in the container

import java.util.ArrayList;

public class maxWater {

    public static int maxwater(ArrayList<Integer> n)
    {
        int lp=0;
        int rp=n.size()-1;
        int maxwater=0;
        while(lp<rp)
        {
           int currwater=(rp-lp)*Math.min(n.get(lp),n.get(rp));
           if(n.get(lp)<n.get(rp))
           {
            lp++;
           }
           else
           {
            rp--;
           }
           if(maxwater<currwater)
           {
            maxwater=currwater;
           }

        }
        return maxwater;

    }

    public static void main(String[] args) {
        ArrayList<Integer> n=new ArrayList<>();
        n.add(1);
        n.add(8);
        n.add(6);
        n.add(2);
        n.add(5);
        n.add(4);
        n.add(8);
        n.add(3);
        n.add(7);

        System.out.println("The maximum water possible in the container: "+maxwater(n)+" units");

    }
    
}
