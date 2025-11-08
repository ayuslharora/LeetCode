class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] og = arr.clone();
        Arrays.sort(arr);

        HashMap<Integer,Integer> hm = new HashMap<>();

        int rank = 1;

        for(int num : arr){
            if(!hm.containsKey(num)){
                hm.put(num,rank++);
            }
        }
        
        int n = og.length;
        int[] ans = new int[n];

        for(int i = 0 ; i < n ; i++){
            ans[i] = hm.get(og[i]);
        }

        return ans;
    }
}