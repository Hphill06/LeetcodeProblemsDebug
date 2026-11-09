import java.util.Stack;
import java.util.HashMap;
public class validParentheses {
        public boolean isValid(String s) {
            Stack<Character> st = new Stack<>();
            HashMap<Character,Character> pairs = new HashMap<>();


            pairs.put(')','(');
            pairs.put(']','[');
            pairs.put('}','{');

            for(char c : s.toCharArray()){

                if(pairs.containsValue(c)){//check if opening bracket
                    st.push(c);
                }else if(pairs.containsKey(c)){
                    if(st.isEmpty()|| !(pairs.get(c).equals(st.pop()))){
                        return false;
                    }

                }

            }


            return st.isEmpty();
        }
    public static void main(String[] args){
        validParentheses a = new validParentheses();


        a.isValid("([)]");
    }
}


