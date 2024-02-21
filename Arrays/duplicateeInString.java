public class duplicateeInString {

    public static StringBuilder dup(String s,int idx,boolean map[],StringBuilder sb)
    {
        if(idx==s.length())
        {
            return sb;

        }
        char c=s.charAt(idx);
        if(map[c-'a']==true)
        {
            dup(s,idx+1,map,sb);
        }
        else{
            map[c-'a']=true;
            dup(s,idx+1,map,sb.append(c));
        }
        return sb;

    }

    public static void main(String[] args) {
        String s="hfffffftttttttttrrrrrrkkkkk";
        boolean map[]=new boolean[26];
        StringBuilder sb=new StringBuilder();
        System.out.println(dup(s,0,map,sb));
    }
    
}
