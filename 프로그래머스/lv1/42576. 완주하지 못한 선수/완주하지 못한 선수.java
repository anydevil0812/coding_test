import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<Integer, String> map = new HashMap<>();
        int hashSum = 0;
        for(String i : participant){
            Integer a = new Integer(i.hashCode());
            map.put(a, i);
            hashSum += a;
        }
        for(String j : completion){
            hashSum -= j.hashCode();
        }
        return map.get(hashSum);
    }
}