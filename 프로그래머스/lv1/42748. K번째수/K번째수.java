import java.util.*;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int[] a = new int[commands[i][1] - commands[i][0] + 1];
            for (int j = 0; j < a.length; j++) {
                a[j] = array[j + commands[i][0] - 1];
            }
            Arrays.sort(a);
            answer[i] = a[commands[i][2] - 1];
        }
        return answer;
    }
}
