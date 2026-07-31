class Solution {
    public int search(int[] nums, int target) {
        int s = 0;
        int l = nums.length-1;
        boolean f = false;

        while(s<=l){
            int mid = (l-s)/2 +s;

            if(nums[mid]<target){
                s=mid+1;
            }else if(nums[mid]>target){
                l=mid-1;
            }else{
                f=true;
                s = mid;
                break;
            }
        }

        if(!f){
            return -1;
        }

        return s;

        
    }
}