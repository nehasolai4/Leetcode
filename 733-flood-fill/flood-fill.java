class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{sr,sc});

        if(image[sr][sc]==color){
            return image;
        }

        int og = image[sr][sc];

        image[sr][sc] = color;
        while(!q.isEmpty()){
            int[]  cell = q.poll();

            int r=cell[0]; int c=cell[1];

            int directions[][]={{-1,0},{1,0},{0,-1},{0,1}};

            for(int dir[] : directions){
                int nrow = r+dir[0];
                int ncol = c+dir[1];

                if(nrow>=0 && nrow<image.length
                && ncol>=0 && ncol<image[0].length
                && image[nrow][ncol]==og){
                    image[nrow][ncol]=color;
                    q.offer(new int[]{nrow,ncol});
                }
            }        
        }
        return image;
    }
}