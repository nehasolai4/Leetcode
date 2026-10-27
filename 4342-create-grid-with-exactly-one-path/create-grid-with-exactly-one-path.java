class Solution {
    public String[] createGrid(int m, int n) {
        
        char mat[][] = new char[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]='#';
            }
        }

        for(int j=0;j<n;j++){
            mat[0][j]='.';
        }

        for(int i=0;i<m;i++){
            mat[i][n-1]='.';
        }

        String result[] = new String[m];

        for(int i=0;i<m;i++){
            String row="";
            for(int j=0;j<n;j++){
                row+=mat[i][j];
            }

            result[i]=row;
        }

        return result;
    }
}