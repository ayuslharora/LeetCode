class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;
        boolean inc = false ; 
        boolean dec = false ; 
        for(int i = 0 ; i<n -1  ; i++){
            if(nums[i]==nums[i+1]) continue ;
            if(nums[i]<nums[i+1]){
                inc = true; 
            }else if(nums[i]>nums[i+1]){
                dec = true;

            }
            
        }
        if(inc == true && dec == true ){
            return false;
        }else{
            return true ;
        }

        
    }
}