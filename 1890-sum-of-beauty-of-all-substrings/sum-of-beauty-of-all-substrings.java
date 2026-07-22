class Solution {
    public int beautySum(String s) {
        int result=0;
        for(int i=0;i<s.length();i++){
            int arr[] = new int[26];
            for(int j=i;j<s.length();j++){

                int min=501;
                int max=0;
                
                char ch = s.charAt(j);
                arr[ch-'a']++;                

                for(int k=0;k<26;k++){
                    if(arr[k]>0){
                        max=Math.max(arr[k],max);
                        min=Math.min(arr[k],min);
                    }
                }
                result+=(max-min);
            }
        }
        return result;
    }
}