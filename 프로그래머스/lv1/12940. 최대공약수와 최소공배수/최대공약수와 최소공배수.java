import java.util.*;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        ArrayList<Integer> a = new ArrayList<>();
        if(m > n){
            int k = n;
            n = m;
            m = k;
        }
        for(int i = 1; i <= n; i++){
            if(m % i == 0 && n % i == 0){
                a.add(i);
            }
        }
        int max = 0;
        for (int i : a) {
            if (i > max) {
                max = i;
            }
        }
        answer[0] = max;
        answer[1] = (n * m) / max;
        return answer;
    }
}