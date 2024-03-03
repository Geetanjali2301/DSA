import java.util.*;
public class reverseString {

    public static String reverse(String s)
    {
        String ans="";
        Stack<Character> stack=new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            stack.push(s.charAt(i));
        }

        while(!stack.isEmpty())
        {
            ans+=stack.pop();
        }

        return ans;
    }

    public static void main(String[] args) {
        String s="abcdad";
        System.out.println("The reversed string is: "+reverse(s));
    }
    
}
