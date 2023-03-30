class Solution {
    public int[] solution(int n) {
        int a = n / 2;
        if(n % 2 == 1){
            a++;
        }
        int[] answer = new int[a];
        for(int i = 0; i < a; i++){
            answer[i] = 2 * i + 1;
        }
        return answer;
    }
}