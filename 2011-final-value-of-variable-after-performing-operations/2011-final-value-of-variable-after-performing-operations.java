class Solution {
    public int finalValueAfterOperations(String[] operations) {
        return func(operations,0,0);
    }

    public int func(String[] operations,int index,int value){
        if(index==operations.length){
            return value;
        }

        if(operations[index].contains("+")){
            return func(operations,index+1,value+1);
        }else{
            return func(operations,index+1,value-1);
        }
    }
}