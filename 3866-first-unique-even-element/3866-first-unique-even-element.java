class Solution {
    public int firstUniqueEven(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        // int max = 0;
        for(int x: nums){
            map.put(x,map.getOrDefault(x,0)+1);
            // max = Math.max(max,x);
        }

        for(int i = 0 ; i <nums.length ; i++){
            int ele = nums[i];
            if(ele%2==0){
                int feq = map.get(ele);
                if(feq==1){
                    return ele;
                }
            }
        }
        return -1;
    }
}