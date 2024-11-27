import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = nums.length;
        
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);            
        }

        int size = nums.length / 2;
        int mapSize = map.size();
        
        if (mapSize >= size){
            return size;
        }
        return mapSize;
    }
}
