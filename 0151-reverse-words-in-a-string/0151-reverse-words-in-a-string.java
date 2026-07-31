class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        String ans = "";
        String word = "";

        for(int i = 0; i < n ; i++){
            String c = String.valueOf(s.charAt(i));
            if(c.equals(" ")){
                if(!word.isEmpty()) {
                    ans = word + (ans.isEmpty() ? "" : " ") + ans;
                    word = "";
                }
            }else{
                word += c;
            }
        }
        if(!word.isEmpty()) {
            ans = word + (ans.isEmpty() ? "" : " ") + ans;
        }
        return ans;
    }
}