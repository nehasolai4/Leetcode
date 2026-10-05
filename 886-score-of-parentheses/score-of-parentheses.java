class Solution {
    public int scoreOfParentheses(String s) {
        
        Deque<Integer>stack = new ArrayDeque<>();

        if(s.length()==2)
            return 1;
    

        stack.push(0);

        for(char ch: s.toCharArray()){
            if(ch=='('){
                stack.push(0);
            }
            else{
                int inside = stack.pop();
                int score;
                if(inside==0)
                    score=1;
                else
                    score=2*inside;
                
                stack.push(stack.pop()+score);
            }
        }

        return stack.pop();
    }
}