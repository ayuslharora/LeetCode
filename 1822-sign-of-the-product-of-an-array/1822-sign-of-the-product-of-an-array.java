class Solution {
    public int arraySign(int[] nums) {
        return func(nums,0,1);
    }

    public int func(int[] operations,int index,int value){
        if(index==operations.length){
            return value;
        }

        if(operations[index]>0){
            return func(operations,index+1,value*1);
        }else if(operations[index]<0){
            return func(operations,index+1,value*(-1));
        }else{
            return func(operations,index+1,value*0);
        }
    }
}