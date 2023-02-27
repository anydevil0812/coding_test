class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(String word : babbling){
            if(word.split("aya|ye|woo|ma").length == 0){
                answer++;
            }
        }
        return answer;
    }
}