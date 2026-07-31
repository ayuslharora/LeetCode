class Solution {
    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        Stack<Integer> st = new Stack<>();

        for(int i = 0 ;i < n ; i++){
            String token = String.valueOf(tokens[i]);
            if(token.equals("+")){
                int n1 = st.pop();
                int n2 =  st.pop();
                st.push(n1+n2);
            }else if(token.equals("-")){
                int n1 = st.pop();
                int n2 =  st.pop();
                st.push(n2-n1);
            }else if(token.equals("*")){
                int n1 = st.pop();
                int n2 =  st.pop();
                st.push(n1*n2);
            }else if(token.equals("/")){
                int n1 = st.pop();
                int n2 =  st.pop();
                st.push(n2/n1);
            }else{
                st.push(Integer.parseInt(token));
            }
        }

        return st.pop();
        
    }
}