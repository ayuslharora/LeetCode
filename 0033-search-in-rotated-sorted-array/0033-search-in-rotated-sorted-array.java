class Solution {

    public int findPivot(int[] A){
        int low = 0;
        int high = A.length-1;

        while(low<high){
            int mid = (low+high)/2;

            if(A[mid]<A[high]){
                high = mid;
            }else{
                low = mid+1;
            }
        }

        return (low-1+A.length)%A.length;
    }

    public int binarySearch(int[] A , int low , int high, int target){

        while(low<=high){
            int mid = (low+high)/2;

            if(A[mid]==target){
                return mid;
            }else if(A[mid]>target){
                high = mid-1;
            }else{
                low = mid +1;
            }
        }
        return -1;
    }

    public int search(int[] A, int target) {
        int piv = findPivot(A);
        if(piv==A.length-1){
            return binarySearch(A,0,A.length-1,target);
        }

        if(A[A.length-1]>=target){
            return binarySearch(A,piv+1,A.length-1,target);
        }else{
            return binarySearch(A,0,piv,target);
        }

    }
}