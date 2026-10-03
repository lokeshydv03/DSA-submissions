class Solution {
    public boolean isValid(String s) {
         if(s == null || s.length() == 0){
            return true;
        }
        Deque<Character> st = new LinkedList<>();
        for(char ch : s.toCharArray()){
            if(ch == '('){
                st.push(')');
            }else if (ch == '{'){
                st.push('}');
            }else if (ch == '['){
                st.push(']');
            }else if (st.isEmpty() || st.pop() != ch){
                return false;
            }
        }
        return st.isEmpty();
    }
}
