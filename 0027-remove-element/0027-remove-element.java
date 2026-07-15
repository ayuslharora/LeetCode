class Solution {
    public int removeElement(int[] nums, int val) {
        int[] feq = new int[51];
        int k = 0 ;
        for(int num : nums ){
            if(num==val){
                k++;
            }else{
                feq[num]++;
            }

        }
        int idx =0 ; 
        for(int i = 0 ; i < feq.length ; i++){
            while(feq[i]>0){
                nums[idx++]=i;
                feq[i]--;
            }
        }
        return nums.length - k;
        
    }
}