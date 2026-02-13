class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> set = new HashSet<>();
        int size = s.length();
        for(int i = 0 ; i <size ;i++){
            set.add(s.charAt(i));
        }
        return set.size();
    }
}