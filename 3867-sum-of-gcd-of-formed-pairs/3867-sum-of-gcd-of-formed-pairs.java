class Solution {

    public int gdc(int a , int b){
        if(b==0){
            return a;
        }
        return gdc(b,a%b);
    }
    
    public long gcdSum(int[] nums) {

    
        
        int n = nums.length;
        int mx = Integer.MIN_VALUE;
        int[] prefixgdc = new int[n];

        if(n==1){
            return 0;
        }

        for(int i = 0 ; i < n ; i++){
            mx = Math.max(mx,nums[i]);
            prefixgdc[i] = gdc(mx,nums[i]);
        }

        Arrays.sort(prefixgdc);

        long sum = 0;
        
        for(int i = 0 ; i < n/2 ; i++){
            int p1 = prefixgdc[i];
            int p2 = prefixgdc[n-i-1];
            sum+=gdc(p1,p2);
        }
        return sum;
        
        
    }
}