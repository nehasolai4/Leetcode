class Solution {
    ArrayList<List<String>> ans = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        int x[] = new int[n];
        nQueens(1,n,x);

        return ans;
    }

    public void nQueens(int k,int n,int x[]){
        for(int i=1;i<=n;i++){
            if(Place(k,i,x)){
                x[k-1]=i;
                if(k==n){
                    ArrayList<String> result = new ArrayList<>();
                    for(int row=0;row<n;row++){
                        StringBuilder s = new StringBuilder();
                        for(int col=1;col<=n;col++){
                            if(x[row]==col)
                                s.append('Q');
                            else
                                s.append('.');
                        }
                        result.add(s.toString());
                    }
                    ans.add(result);
                }
                else
                    nQueens(k+1,n,x);
            }
        }
    }
    public boolean Place(int k,int i,int x[]){
        for(int j=1;j<=k-1;j++){
            if((x[j-1]==i)||(Math.abs(x[j-1]-i))==(Math.abs(j-k)))
                return false;
        }
        return true;
    }
}