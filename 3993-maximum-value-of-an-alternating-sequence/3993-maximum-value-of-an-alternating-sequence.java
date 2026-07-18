class Solution {
    public long maximumValue(int n, int s, int m) {

        if(n==1){
            return (long)s;
        }
        
        n = n-1;
        long maxv = 0;
        if(n%2==0){
            maxv = s + (long)(n/2)*m -(n/2);
            // return maxv;
        }else{
            maxv = s + (long)((n+1)/2)*m - ((n-1)/2);
            // return maxv;
        }

        if(n%2==0){
            return maxv+1;
        }
        return maxv;
    }
}