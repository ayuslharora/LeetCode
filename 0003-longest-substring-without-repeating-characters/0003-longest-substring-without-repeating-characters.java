class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int n = s.length();
        int size = 0;
        int l = 0;
        int r = 0;
        int max = -1;
        while(r<n){
            Character c = s.charAt(r);
            if(map.containsKey(c) && l<=r){
                map.remove(s.charAt(l));
                l++;
            }else{
                map.put(c,1);
                max = Math.max(max,r-l==0?0:r-l+1);
                r++;
            }
        }

        if(max==0){
            return 1;
        }else if(max==-1){
            return 0;
        }
        return max;
    }
}