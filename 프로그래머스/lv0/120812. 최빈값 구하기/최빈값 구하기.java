import java.util.*;

class Solution {
    public int solution(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0, mode = 0;
        for(int i = 0; i < array.length; i++) {
            int value = array[i];
            int count = map.getOrDefault(value, 0) + 1;
            map.put(value, count);
            if(count > max) {
                max = count;
                mode = value;
            } else if(count == max) {
                mode = -1;
            }
        }
        return mode;
    }
}    