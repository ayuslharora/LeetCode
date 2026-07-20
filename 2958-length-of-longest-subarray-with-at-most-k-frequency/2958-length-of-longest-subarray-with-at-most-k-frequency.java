class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int ans = 0;

        for (int right = 0; right < nums.length; right++) {

            int count = map.getOrDefault(nums[right], 0);

            while (count >= k) {
                map.put(nums[left], map.get(nums[left]) - 1);
                left++;
                count = map.getOrDefault(nums[right], 0);
            }

            map.put(nums[right], count + 1);

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}