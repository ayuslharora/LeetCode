class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int n = nums.length;
        int l = 0;
        int h = 0;
        int ans = 0;

        while(h<n){
            if((map.get(nums[h])==null)||(map.get(nums[h])<k)){
                map.put(nums[h], map.getOrDefault(nums[h], 0) + 1);
                h++;
            }else{
                map.put(nums[l],map.get(nums[l])-1);
                l++;
            }

            ans = Math.max(ans,h-l);
        }

        return ans;
    }
}