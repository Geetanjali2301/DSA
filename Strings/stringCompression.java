public class stringCompression {

    public static void compress(String s)
    {
        String str="";
        int i=0;
        for(i=0;i<s.length();i++)
        {
        int count=1;
        while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1))
        {
            count++;
            i++;
        }
        str+=s.charAt(i);
        if(count>1)
        {
            str+=count;
        }
        else
        {
        str+=s.charAt(i+1);
        }
    }

        System.out.println("The compressed string is: "+str);
    }

    public static void main(String[] args) {
        String s="aaabbbbbccc";
        compress(s);
    }
    
}
