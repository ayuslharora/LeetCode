class Solution {

    public long timer(int[] A ,int t){
        long time = 0;
        for(int x : A){
            time += (((long)x + t - 1) / t);
        }
        return time;
    }


    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for(int x:piles){
            max = Math.max(x,max);
        }
        
        int high = max;
        int low = 1;
        long ans = 0;

        while(low<=high){
            int mid = (low+high)>>1;
            long A = timer(piles,mid);

            if(A<=h){
                high = mid-1;
                ans = mid;
            }else{
                low = mid+1;
            }

            
        }
        return (int)ans;
    }
}