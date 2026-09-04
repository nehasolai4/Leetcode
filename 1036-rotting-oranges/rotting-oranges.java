class Solution {
    public int orangesRotting(int[][] grid) {

        int minutes=0;

        Queue<int[]> q = new LinkedList<>();

        int fresh=0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2)
                    q.offer(new int[]{i,j});
                else if(grid[i][j]==1)  
                    fresh++;
            }
        }

        int dir[][] = {{-1,0},{1,0},{0,-1},{0,1}};
        while(!q.isEmpty()){
            int size = q.size();

            for(int k=0; k<size;k++){
                int curr[] = q.poll();

                int i = curr[0];
                int j = curr[1];

                for(int d[]:dir){
                    int nr = d[0]+i;
                    int nc = d[1]+j;

                    if(nr>=0 && nc>=0 && nr<grid.length && nc<grid[0].length && grid[nr][nc]==1 ){
                        grid[nr][nc]=2;
                        fresh--;
                        q.offer(new int[]{nr,nc});
                    }
                }
            }
            if(!q.isEmpty())
                minutes++;
        }
        return (fresh==0)?minutes:-1;

    }
}