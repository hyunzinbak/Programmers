import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {        
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for(String part : participant) {
            map.put(part, map.getOrDefault(part, 0) + 1);
        }
        
       for(String com : completion) {
            if (map.containsKey(com)) {
                if (map.get(com) == 1) {
                    map.remove(com);
                } else {
                    map.put(com, map.getOrDefault(com, 0) - 1);
                }
                continue;
            }        
        }
        
        return map.keySet().iterator().next();       
    }
}