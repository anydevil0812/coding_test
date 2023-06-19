class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int s = brown + yellow;
        for(int i = 1; i < s; i++){
            if(s % i == 0){
                int a = s / i;
                if(i >= a && (i-2) * (a-2) == yellow){
                    answer[0] = i;
                    answer[1] = a;
                    return answer;
                }
            } 
        }
        return answer;
    }
}