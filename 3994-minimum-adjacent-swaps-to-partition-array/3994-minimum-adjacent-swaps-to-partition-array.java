class Solution {
    public int minAdjacentSwaps(int[] nums, int a, int b) {
        int c0 = 0;
        int c1 = 0;
        int c2 = 0;
        int cost = 0;
        int m = 1000000007;

        for(int num : nums){
            if(num>b){
                c2++;
            }else if(num<=b && num>=a){
                c1++;
                cost = (cost +c2)%m;
            }else if(num<a){
                c0++;
                cost = (cost + c1 + c2)%m;
            }
        }
        return cost;
    }
}