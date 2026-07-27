class Solution {
    public boolean judgeCircle(String moves) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<moves.length();i++){
            char ch = moves.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<moves.length();i++){
            char ch = moves.charAt(i);
            if(ch=='L'){
                if(!map.containsKey('R'))
                    return false;
                map.put('R',map.get('R')-1);
                if(map.get('R')<0)
                    return false;
            }
            if(ch=='D'){
                if(!map.containsKey('U'))
                    return false;
                map.put('U',map.get('U')-1);
                if(map.get('U')<0)
                    return false;
            }
            if(ch=='R'){
                if(!map.containsKey('L'))
                    return false;
                map.put('L',map.get('L')-1);
                if(map.get('L')<0)
                    return false;
            }
            if(ch=='U'){
                if(!map.containsKey('D'))
                    return false;
                map.put('D',map.get('D')-1);
                if(map.get('D')<0)
                    return false;
            }
        }

        return true;


    }
}