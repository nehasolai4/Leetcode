class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> result = new ArrayList<>();

        parenthesis(n,n,"",result);

        return result;
    }

    public static void parenthesis(int open, int close,String s,List<String> result){

        if(open==0 && close==0){
            result.add(s);
            return;
        }
        if(open>0){
            parenthesis(open-1,close,s+"(",result);
        }
        if(close>open){
            parenthesis(open,close-1,s+")",result);
        }
    }
}