import java.util.Arrays;

class Solution {
    public int[] solution(int[][] score) {
        int len = score.length;
        double[] arr = new double [len];
        for(int i = 0; i < len; i++){
           arr[i] = (score[i][0] + score[i][1]) / (double) 2;
         }
        double[] arr2 = Arrays.copyOf(arr, len);
        Arrays.sort(arr);
        int[] answer = new int [len];
        for(int j = 0; j < len; j++){
            for(int k = 0; k < len; k++){
                if(arr2[j] == arr[k]){
                    answer[j] = len - k;
                }
            }
        }
        return answer;
    }
}