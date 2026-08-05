class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        
        List<Integer>[] graph = new ArrayList[n];
        for(int i=0;i<n;i++)
            graph[i]=new ArrayList<>();

        for(int e[]:invocations)
            graph[e[0]].add(e[1]);

        boolean sus[] = new boolean[n];

        dfs(k,graph,sus);

        for(int e[]:invocations){
            int u=e[0];
            int v=e[1];

            if(!sus[u]&&sus[v]){
                List<Integer> res = new ArrayList<>();
                for(int i=0;i<n;i++)
                    res.add(i);
                return res;
            }
        }

        List<Integer> res = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(!sus[i])
                res.add(i);
        }
        return res;
    }

    private void dfs(int node, List<Integer>[]graph, boolean sus[]){
        if(sus[node])
            return;

        sus[node]=true;

        for(int n:graph[node])
            dfs(n,graph,sus);
    }
}