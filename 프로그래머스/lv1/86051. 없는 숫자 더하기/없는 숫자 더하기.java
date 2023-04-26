class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for(int i = 1; i <= 9; i++){
            answer += i;
        }
        for(int j : numbers){
            answer -= j;
        }
        return answer;
    }
}