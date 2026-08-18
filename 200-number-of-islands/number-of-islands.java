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

                    Queue<int[]> queue = new LinkedList<>();
                    visited[i][j]=true;

                    queue.offer(new int[]{i,j});

                    while(!queue.isEmpty()){
                        int cell[]=queue.poll();

                        int row = cell[0]; int col=cell[1];

                        int directions[][]={{-1,0},{1,0},{0,-1},{0,1}};

                        for(int dir[]:directions){
                            int nrow = row+dir[0];
                            int ncol = col+dir[1];

                            if(nrow>=0 && nrow<r
                            && ncol>=0 && ncol<c 
                            && grid[nrow][ncol]=='1' && !visited[nrow][ncol]){
                                visited[nrow][ncol]=true;
                                queue.offer(new int[]{nrow,ncol});
                            }
                        }
                    }

                }
            }
        }
        return islands;
    }
}