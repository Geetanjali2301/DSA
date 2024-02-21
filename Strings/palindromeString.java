public class palindromeString {

    public static boolean palindrome(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-i-1))
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s="race";
        System.out.println(palindrome(s));
    }
    
}
