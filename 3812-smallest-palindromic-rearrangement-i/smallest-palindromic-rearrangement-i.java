class Solution {
    public String smallestPalindrome(String s) {
        if(s.length()==1)
            return s;


        char firstHalf[] = new char[s.length()/2];

        for(int i=0;i<s.length()/2;i++){
            firstHalf[i]=s.charAt(i);
        }

        
        Arrays.sort(firstHalf);

        StringBuilder result = new StringBuilder();

        for(int i=0;i<firstHalf.length;i++){
            result.append(firstHalf[i]);
        }

        if(s.length()%2==1){
           result.append(s.charAt(s.length()/2));
        }


        for(int i=firstHalf.length-1;i>=0;i--){
            result.append(firstHalf[i]);
        }

        return result.toString();
    }
}