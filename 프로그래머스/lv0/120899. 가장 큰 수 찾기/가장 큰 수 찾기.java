import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int[] a = Arrays.copyOf(array, array.length);
        Arrays.sort(array);
        answer[0] = array[array.length-1];
        for(int i = 0; i < a.length; i++){
            if(a[i] == answer[0]){
                answer[1] = i;
                break;
            }
        }
        return answer;
    }
}