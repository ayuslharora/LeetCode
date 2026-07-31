class Solution {
    public int scoreOfString(String s) {
        int ans = 0;
        int size = s.length();
        for(int i = 0 ; i+1< size ; i++){
            char a = s.charAt(i);
            char b = s.charAt(i+1);
            ans += Math.abs(a-b);
        }
        return ans;
    }
}