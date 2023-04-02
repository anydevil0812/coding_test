import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int len = emergency.length;
        int[] answer = new int[len];
        int[] a = Arrays.copyOf(emergency, len);
        Arrays.sort(emergency);
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len; j++) {
                if(a[i] == emergency[j]) {
                    answer[j] = len - i;
                }
            }
        }
        return answer;
    }
}