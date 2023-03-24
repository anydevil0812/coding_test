class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i : array){
            String num = Integer.toString(i);
            for(int j = 0; j < num.length(); j++){
                char a = num.charAt(j);
                answer += (a == '7') ? 1 : 0;
            }
        }
        return answer;
    }
}