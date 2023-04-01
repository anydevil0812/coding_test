import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        int[] answer = new int[len];
        if(len == 1){
            answer[0] = -1;
            return answer;
        }
        int[] arr2 = Arrays.copyOf(arr, len);
        Arrays.sort(arr);
        int min = arr[0];
        return Arrays.stream(arr2).filter(i -> i != min).toArray();
    }
}