class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] feq = new int[1001];

        if(nums2.length > nums1.length){
            int[] temp = nums2;
            nums2 = nums1;
            nums1 = temp ;
        }

        for(int num : nums1){
            feq[num]++;
        }
        int idx = 0 ; 

        for(int num : nums2){
            if(feq[num]>0){
                nums1[idx++]=num;
                feq[num]--;
            }
        }

        int[] ans = new int[idx];

        for(int i = 0 ; i<idx ; i++){
            ans[i]=nums1[i];
        }
        
        return ans; 
    }
}