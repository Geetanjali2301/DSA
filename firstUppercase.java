//Convert first letter of every word to uppercase
public class firstUppercase {
    public static void firstToUpper(String s)  
    {
        StringBuilder sb=new StringBuilder("");

        char ch=Character.toUpperCase(s.charAt(0));
        sb.append(ch);

        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                sb.append(s.charAt(i));
                i++;
                sb.append(Character.toUpperCase(s.charAt(i)));
            }
            else{
                sb.append(s.charAt(i));
            }
    
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        String s="this is geetanjali";
        firstToUpper(s);
    }
    
}
