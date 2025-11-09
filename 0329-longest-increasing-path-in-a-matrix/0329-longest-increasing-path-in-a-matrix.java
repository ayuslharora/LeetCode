class Solution {

    public ArrayList<ArrayList<Integer>> maximum(int[][] matrix){
        ArrayList<ArrayList<Integer>> index = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        int m = matrix.length;
        int n = matrix[0].length;

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j <n; j++){
                if(matrix[i][j]>max){
                    max = matrix[i][j];
                }
            }
        }

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j <n; j++){
                if(matrix[i][j]==max){
                    ArrayList<Integer> arr = new ArrayList<>();
                    arr.add(i);
                    arr.add(j);
                    index.add(arr);
                }
            }
        }

        return index;
    }

    //A recursive function which goes to the next smaller element and does that until it hits a deadend and then when it hits a deadend it returns the number of blocks it moved from the orignal position
    public int toSmallest(int[][] matrix, ArrayList<Integer> arr){
        int p = arr.get(0);
        int q = arr.get(1);

        int m = matrix.length;
        int n = matrix[0].length;

        int longest = 1;   // Current cell counts as 1

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        for(int i = 0; i < 4; i++){
            int nr = p + dr[i];
            int nc = q + dc[i];

            if(nr >= 0 && nr < m && nc >= 0 && nc < n &&
            matrix[nr][nc] < matrix[p][q]){

                ArrayList<Integer> next = new ArrayList<>();
                next.add(nr);
                next.add(nc);

                longest = Math.max(longest, 1 + toSmallest(matrix, next));
            }
        }

        return longest;
    }


    public int longestIncreasingPath(int[][] matrix) {
        ArrayList<ArrayList<Integer>> index = maximum(matrix);

        int ans = 0;

        for(ArrayList<Integer> cell : index){
            ans = Math.max(ans, toSmallest(matrix, cell));
        }

        return ans;
    }
}