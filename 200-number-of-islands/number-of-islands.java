class Solution {
    public int numIslands(char[][] grid) {
        //bfs
        int r = grid.length;
        int c = grid[0].length;
        
        boolean visited[][] = new boolean[r][c];

        int islands=0;

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    islands++;
                    dfs(grid,visited,i,j);

                }
            }
        }
        return islands;
    }

    public void dfs(char grid[][],boolean visited[][],int row,int col){
        visited[row][col]=true;

        int directions[][] ={{-1,0},{1,0},{0,-1},{0,1}};

        for(int dir[]:directions){
            int nrow = row+dir[0];
            int ncol = col+dir[1];

            if(nrow>=0 && nrow<grid.length
            && ncol>=0 && ncol<grid[0].length
            && grid[nrow][ncol]=='1' && !visited[nrow][ncol]){

                dfs(grid,visited,nrow,ncol);
            }
        }
    }
}