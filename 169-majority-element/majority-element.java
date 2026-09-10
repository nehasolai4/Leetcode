class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int n:nums){
            if(freq.containsKey(n))
                freq.put(n,freq.get(n)+1);
            else
                freq.put(n,1);
        }


        int result=-1;
        int maxCount=-1;

        for(Map.Entry<Integer,Integer> entry: freq.entrySet()){
            if(entry.getValue()>maxCount){
                maxCount=entry.getValue();
                result=entry.getKey();
            }
        }

        return result;
    }
}