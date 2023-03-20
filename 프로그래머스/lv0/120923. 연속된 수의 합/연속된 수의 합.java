class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int m = total / num;
        int s = (total % num == 0) ? num / 2 : num / 2 - 1;
        for(int i = 0; i < num; i++){
            answer[i] = m-s+i;
        }
        return answer;
    }
}