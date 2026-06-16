import java.util.Stack;

public class ValidParenthesis {

    public static void main (String[] args){
        String str = "()[]{}";
        Stack<Character>st = new Stack<>();
        boolean ans = isValid(str,st);
        System.out.println(ans);
    }
    public static boolean isValid(String s, Stack<Character>st) {

        /*approach 1

        for(int i=0;i<str.length();i++){
            if( st.isEmpty() || str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='[')
                st.push(str.charAt(i));
            if(str.charAt(i)==')'){
                if(st.peek()=='(')
                    st.pop();
                else return false;
            }
            if(str.charAt(i)=='}'){
                if(st.peek()=='{')
                    st.pop();
                else return false;
            }
            if(str.charAt(i)==']'){
                if(st.peek()=='[')
                    st.pop();
                else return false;
            }
        }
        return st.isEmpty();
     */
 //approach 2
        for(int i =0;i< s.length();i++){
            if(s.charAt(i)=='(')
                st.push(')');
            else if(s.charAt(i)=='{')
                st.push('}');
            else if(s.charAt(i)=='[')
                st.push(']');
            else if( st.isEmpty() || st.peek()!=s.charAt(i))
                return false;
            else st.pop();

        }
        return st.isEmpty();
    }
}
