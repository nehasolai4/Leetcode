class Solution {
    public void rotate(int[][] matrix) {

        int tp[][] = new int[matrix.length][matrix[0].length];
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                tp[i][j]=matrix[j][i];
            }
        }


        for(int i=0;i<matrix.length;i++){
            int ind=0;
            for(int j=matrix[0].length-1;j>=0;j--){
                matrix[i][ind]=tp[i][j];
                ind++;
            }
        }

    }
}