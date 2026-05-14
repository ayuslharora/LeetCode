class Solution {
    public int maximumProduct(int[] ns) {
        Arrays.sort(ns);
        
       int n=ns.length-1;
       return Math.max(ns[n]*ns[n-1]*ns[n-2],ns[0]*ns[1]*ns[n]);
        
    }
}