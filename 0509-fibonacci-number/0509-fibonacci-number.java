class Solution {
    public int fib(int n) {
        int a = 0 ; 
        int b = 1 ; 
        if(n==0) return 0;
        if(n==1) return 1 ;
        if(n==2) return 1;
        n = n-1;
        while(n-->0){
            int temp = a+b;
            a = b ;
            b= temp ;
        }
        return b ;
        
    }
}