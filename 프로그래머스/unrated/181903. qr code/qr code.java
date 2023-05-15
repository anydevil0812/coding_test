class Solution {
    public String solution(int q, int r, String code) {
        char[] arr = code.toCharArray();
        String answer = "";
        for(int i = 0; i < arr.length; i++){
            if(i % q == r){
                answer += arr[i];
            }
        }
        return answer;
    }
}