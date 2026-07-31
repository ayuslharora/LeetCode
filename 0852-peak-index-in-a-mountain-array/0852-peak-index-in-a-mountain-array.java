class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low<high){
            int mid = ((high-low)>>1) + low;

            if(arr[mid]<arr[mid+1]){
                low = mid +1;
            }else if(arr[mid]>arr[mid+1]){
                high = mid;
            }
        }

        return low;


    }
}