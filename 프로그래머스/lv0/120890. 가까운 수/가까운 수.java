import java.lang.Math;
import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int len = array.length;
        int[] arr = Arrays.copyOf(array, len);
        for(int i = 0; i < len; i++){
            array[i] = Math.abs(n - array[i]);
        }
        
        int min = array[0];
        int index = 0;
        for(int j = 0; j < len; j++){
            if(min > array[j]){
                min = array[j];
                index = j;
            } else if(min == array[j] && arr[j] < arr[index]){
                index = j;
            }
        }
        return arr[index];
    }
}