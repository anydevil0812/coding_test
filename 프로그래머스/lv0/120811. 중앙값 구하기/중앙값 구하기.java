import java.util.*;

class Solution {
    public int solution(int[] array) {
        int len = array.length;
        Arrays.sort(array);
        if(len % 2 == 0){
            return array[len / 2 - 1];
        } else {
             return array[len / 2];
        }
    }
}