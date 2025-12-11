class Solution {
    public boolean isPalindrome(int x) {

        if(x<0){
            return false;
        }
        
        int no = x;
        int r = 0;

        while(no>0){
            r = r*10 + no%10;
            no = no/10;
        }

        if(r==x){
            return true ;
        }
        return false;
    }
}