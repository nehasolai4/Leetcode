class Solution {
    public int findCircleNum(int[][] isConnected) {
        
        int n = isConnected.length;

        boolean visited[] = new boolean[n];

        int total=0;

        for(int i=0;i<n;i++){
            if(!visited[i]){
                total++;

                Queue<Integer> q = new LinkedList<>();
                q.offer(i);
                visited[i]=true;

                while(!q.isEmpty()){
                    int city=q.poll();

                    for(int j=0;j<n;j++){
                        if(isConnected[city][j]==1 && !visited[j]){
                            visited[j]=true;
                            q.offer(j);
                        }
                    }
                }
            }
        }
        return total;
        
    }
}