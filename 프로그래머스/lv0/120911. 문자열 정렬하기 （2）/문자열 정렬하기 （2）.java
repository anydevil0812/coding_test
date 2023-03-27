import java.util.*;

class Solution {
    public String solution(String my_string) {
        String a = my_string.toLowerCase();
        char[] x = a.toCharArray();
        Arrays.sort(x);
        String answer = new String(x);
        return answer;
    }
}