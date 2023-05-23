import java.lang.Math;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int len = numlist.length;
        int[] answer = new int[len];
        double[] d = new double[len];
        for(int i = 0; i < len; i++){
            int x = numlist[i] - n;
            if(x < 0){
                d[i] = Math.abs(n - numlist[i]) + 0.5;
            } else {
                d[i] = Math.abs(n - numlist[i]);
            }
        }
        double[] d2 = Arrays.copyOf(d, len);
        Arrays.sort(d);
        for(int j = 0; j < len; j++){
            for(int k = 0; k < len; k++){
                if(d[j] == d2[k]){
                    answer[j] = numlist[k];
                }
            }
        }
        return answer;
    }
}