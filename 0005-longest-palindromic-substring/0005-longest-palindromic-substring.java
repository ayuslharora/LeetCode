class Solution {

    public String isPalindrome(String s,int o,int q){
        int n = s.length();

        while(o>-1 && q<n && s.charAt(o)==s.charAt(q)){
            o--;
            q++;
        }

        return s.substring(o+1,q);
    }

    public String longestPalindrome(String s) {
        int n = s.length();
        String ans = "";

        for(int i = 0 ; i < n; i++){
            String rslt = isPalindrome(s,i,i);
            if(rslt.length()>ans.length()){
                ans = rslt;
            }

            if(i<n-1){
                rslt = isPalindrome(s,i,i+1);
                if(rslt.length()>ans.length()){
                    ans = rslt;
                }
            }

        }

        return ans;
    }
}