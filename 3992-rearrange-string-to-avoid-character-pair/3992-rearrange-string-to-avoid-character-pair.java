class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder ys = new StringBuilder();
        StringBuilder others = new StringBuilder();
        StringBuilder xs = new StringBuilder();

        for(char c : s.toCharArray()){
            if(x==c){
                xs.append(c);
            }else if(c==y){
                ys.append(c);
            }else{
                others.append(c);
            }
        }

        String ans1 = ys.toString()+xs.toString()+others.toString();
        // String ans2 = ys.toString() + others.toString() + xs.toString();

        // if(ans1.equals(s)){
        //     return ans2;
        // }
        return ans1;
    }
}